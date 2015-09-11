package selenium.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import selenium.init.AbstractSelenium;
import selenium.page.BookListPage;

public class BookListTest extends AbstractSelenium {

	private BookListPage bookListPage;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		bookListPage = openLibrary().clickBookList();
		bookListPage.clickAddBook().setTitle("The Hunger Games").setFirstName("Suzanne").setLastName("Collins")
				.clickAddBookButton();
	}

	@Test
	public void shouldReturnListBookAfterClickButtonSearch() {
		bookListPage.clickSearchBooks();
		assertTrue(bookListPage.hasSuccessToFindBookOnList());
	}

	@Test
	public void shouldRemoveBookFromListAfterClickButtonRemove() {
		bookListPage.clickSearchBooks();
		bookListPage.clickRemoveBook();
		assertTrue(bookListPage.hasSuccess());
	}
	
	

}
