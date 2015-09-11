package selenium.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import selenium.init.AbstractSelenium;
import selenium.page.AddAuthorPage;

public class NewAuthorFormValidationTest extends AbstractSelenium {

	private AddAuthorPage addAuthorPage;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		addAuthorPage = openLibrary().clickBookList().clickAddBook().clickAddAuthorButton();
	}

	@Test
	public void shouldCheckValidateFormAndAddBook() {
		addAuthorPage.setFirstName("Jan");
		addAuthorPage.setLastName("Kowalski");
		addAuthorPage.clickAddAuthorButton();
		assertTrue(addAuthorPage.isDisplayRemoveAuthorButton(2));
	}
	
	@Test
	public void shouldCheckIfFirstNameIsRequired() {
		addAuthorPage.setFirstName("Jan");
		addAuthorPage.clickAddAuthorButton();
		assertFalse(addAuthorPage.isDisplayRemoveAuthorButton(2));
		assertTrue(addAuthorPage.hasEmptyInput());
	}
	
	@Test
	public void shouldCheckIfLastNameIsRequired() {
		addAuthorPage.setLastName("Kowalski");
		addAuthorPage.clickAddAuthorButton();
		assertFalse(addAuthorPage.isDisplayRemoveAuthorButton(2));
		assertTrue(addAuthorPage.hasEmptyInput());
	}
		
	@Test
	public void shouldNotAddAuthorToModalAddBook() {
		addAuthorPage.clickCloseButton();
		assertFalse(addAuthorPage.isDisplayRemoveAuthorButton(2));
	}

}
