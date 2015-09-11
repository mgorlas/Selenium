package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.init.AbstractPageObject;

public class HomePage extends AbstractPageObject{
	@FindBy(linkText="Book List")
	private WebElement bookList;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver.get("http://localhost:9721/workshop/");
		//this.driver.get("http://localhost:9000/#/main/welcome");
	}
	
	public BookListPage clickBookList() {
		bookList.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}
	
}
