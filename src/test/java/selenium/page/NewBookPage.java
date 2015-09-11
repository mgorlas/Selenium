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
	@FindBy(css = "div.modal-body > div:nth-child(3) > button")
	private WebElement removeAuthor;
	@FindBy(css = ".addnextauthor")
	private WebElement addAuthor;
	@FindBy(css = "div.modal-footer > button.btn.btn-danger")
	private WebElement close;

	public NewBookPage(WebDriver driver) {
		super(driver);
	}

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

	public BookListPage clickRemoveAuthorButton() {
		removeAuthor.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}
	
	public BookListPage clickAddBookButton() {
		saveBook.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}
	
	public BookListPage clickCloseButton() {
		close.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}
	
	public AddAuthorPage clickAddAuthorButton() {
		addAuthor.click();
		return PageFactory.initElements(driver, AddAuthorPage.class);
	}

}
