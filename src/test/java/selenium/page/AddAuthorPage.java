package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.init.AbstractPageObject;

public class AddAuthorPage extends AbstractPageObject {

	private WebElement firstName;
	private WebElement lastName;
	@FindBy(css = "div.modal:nth-child(7) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(3) > button:nth-child(1)")
	private WebElement addAuthor;
	@FindBy(css = "div.modal:nth-child(7) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(3) > button:nth-child(2)")
	private WebElement close;
	
	public AddAuthorPage(WebDriver driver) {
		super(driver);
	}

	public AddAuthorPage setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
		return this;
	}

	public AddAuthorPage setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
		return this;
	}

	public NewBookPage clickAddAuthorButton() {
		addAuthor.click();
		return PageFactory.initElements(driver, NewBookPage.class);
	}
	
	public NewBookPage clickCloseButton() {
		close.click();
		return PageFactory.initElements(driver, NewBookPage.class);
	}
	
	
}
