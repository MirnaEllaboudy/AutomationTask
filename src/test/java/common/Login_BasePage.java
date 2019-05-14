package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_BasePage {
	
	public static WebDriver driver;

	public void waitForVisabilty(By locator, int time) {
        final WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
	
	public void waitForURLNavigation(String url, int time) {
		final WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.urlToBe(url));
		
	}
}