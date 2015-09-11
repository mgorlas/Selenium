package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.init.AbstractPageObject;

public class NewBookPage extends AbstractPageObject {
	private WebElement inputTitle;
	private WebElement inputFirstName;
	private WebElement inputLastName;
	private WebElement saveBook;
	
	public NewBookPage setTitle(String inputTitle) {
		this.inputTitle.sendKeys(inputTitle);
		return this;
	}
	public NewBookPage setFirstName(String inputFirstName) {
		this.inputFirstName.sendKeys(inputFirstName);
		return this;
	}

	public NewBookPage setLastName(String inputLastName) {
		this.inputLastName.sendKeys(inputLastName);
		return this;
	}
	
	public NewBookPage(WebDriver driver) {
		super(driver);
	}
	
	public BookListPage clickAddBookButton() {
		saveBook.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}

}
