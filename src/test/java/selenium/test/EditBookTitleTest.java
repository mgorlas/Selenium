package selenium.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import selenium.init.AbstractSelenium;
import selenium.page.BookListPage;
import selenium.page.EditBookPage;

public class EditBookTitleTest extends AbstractSelenium {

	private EditBookPage editBookPage;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		editBookPage = openLibrary().clickBookList().clickSearchBooks().clickEditBook();
	}

	@Test
	public void shouldCheckValidateFormAndEditBook() {
		editBookPage.setTitle("The Hunger Games : Mockingjay");
		editBookPage.clickUpdateBookButton();
		assertTrue(editBookPage.hasSuccess());
	}
	
	@Test
	public void shouldCheckIfTitleIsRequired() {
		editBookPage.clickUpdateBookButton();
		assertFalse(editBookPage.hasSuccess());
		assertTrue(editBookPage.hasEmptyInput());
	}
	
	@Test
	public void shouldCheckDontAddBookForClickCancel() {
		editBookPage.clickCancelButton();
		assertFalse(editBookPage.hasSuccess());
	}
}
