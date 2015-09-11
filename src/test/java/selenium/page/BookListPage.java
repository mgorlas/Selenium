package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.init.AbstractPageObject;

public class BookListPage extends AbstractPageObject {
	@FindBy(css = "button.btn:nth-child(3)")
	private WebElement addBook;
	@FindBy(css = ".input-group .btn-primary")
	private WebElement searchBooks;
	@FindBy(css = "tr:nth-child(2) > td:nth-child(3) > button")
	private WebElement editBook;
	@FindBy(css = "tr:nth-child(2) > td:nth-child(4) > button")
	private WebElement removeBook;

	public BookListPage(WebDriver driver) {
		super(driver);
	}

	public NewBookPage clickAddBook() {
		addBook.click();
		return PageFactory.initElements(driver, NewBookPage.class);
	}

	public EditBookPage clickEditBook() {
		editBook.click();
		return PageFactory.initElements(driver, EditBookPage.class);
	}

	public BookListPage clickRemoveBook() {
		removeBook.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}

	public BookListPage clickSearchBooks() {
		searchBooks.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}

}
