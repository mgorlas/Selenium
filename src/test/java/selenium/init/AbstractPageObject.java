package selenium.init;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

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
	public boolean hasEmptyInput() {
		try {
			driver.findElement(By.className("ng-invalid:focus"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
