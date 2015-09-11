package selenium.init;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.page.BookListPage;

public class AbstractPageObject {
	protected WebDriver driver;
	
	public AbstractPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean hasSuccess() {
		try {
			driver.findElement(By.className("alert-success"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean hasSuccessToFindBookOnList() {
		try {
			driver.findElement(By.className("ng-scope"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean hasEmptyInput() {
		try {
			driver.findElement(By.className("ng-invalid:focus"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean isDisplayRemoveAuthorButton(int number) {
		try {
			driver.findElement(By.cssSelector("div.modal-body > div:nth-child("+(2+number)+") > button"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
