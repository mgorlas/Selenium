package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.init.AbstractPageObject;

public class BookListPage extends AbstractPageObject {
	private WebElement addBook;
	
	public BookListPage(WebDriver driver) {
		super(driver);
	}
	
	public NewBookPage clickAddBook() {
		addBook.click();
		return PageFactory.initElements(driver, NewBookPage.class);
	}
	
}
