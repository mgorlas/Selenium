package selenium.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import selenium.init.AbstractSelenium;
import selenium.page.NewBookPage;

public class NewBookFormValidationTest extends AbstractSelenium {

	private NewBookPage newBookPage;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		newBookPage = openLibrary().clickBookList().clickAddBook();
	}

	@Test
	public void shouldCheckValidateFormAndAddBook() {
		newBookPage.setTitle("Book test");
		newBookPage.setFirstName("First name test");
		newBookPage.setLastName("Last name test");
		newBookPage.clickAddBookButton();
		assertTrue(newBookPage.hasSuccess());
	}
	
	@Test
	public void shouldCheckIfTitleIsRequired() {
		newBookPage.setFirstName("First name test");
		newBookPage.setLastName("Last name test");
		newBookPage.clickAddBookButton();
		assertFalse(newBookPage.hasSuccess());
		assertTrue(newBookPage.hasEmptyInput());
	}
	
	@Test
	public void shouldCheckIfFirstNameIsRequired() {
		newBookPage.setTitle("Title test");
		newBookPage.setLastName("Last name test");
		newBookPage.clickAddBookButton();
		assertFalse(newBookPage.hasSuccess());
		assertTrue(newBookPage.hasEmptyInput());
	}
	
	@Test
	public void shouldCheckIfLastNameIsRequired() {
		newBookPage.setTitle("Title test");
		newBookPage.setFirstName("First name test");
		newBookPage.clickAddBookButton();
		assertFalse(newBookPage.hasSuccess());
		assertTrue(newBookPage.hasEmptyInput());
	}
	
	@Test
	public void shouldRemoveAuthorFromModal() {
		newBookPage.clickRemoveAuthorButton();
		assertFalse(newBookPage.isDisplayRemoveAuthorButton(1));
	}
	@Test
	public void shouldCloseModalWindowAndNotAddBook() {
		newBookPage.clickCloseButton();
		assertFalse(newBookPage.hasSuccess());
	}

}
