package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.init.AbstractPageObject;

public class EditBookPage extends AbstractPageObject {
	private WebElement inputTitle;
	@FindBy(css = "div.modal-footer > button.btn.btn-success")
	private WebElement updateBook;
	@FindBy(css = "div.modal-footer > button.btn.btn-danger")
	private WebElement cancelButton;

	public EditBookPage(WebDriver driver) {
		super(driver);
	}
	public EditBookPage setTitle(String inputTitle) {
		this.inputTitle.sendKeys(inputTitle);
		return this;
	}

	public BookListPage clickUpdateBookButton() {
		updateBook.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}

	public BookListPage clickCancelButton() {
		cancelButton.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}
}
