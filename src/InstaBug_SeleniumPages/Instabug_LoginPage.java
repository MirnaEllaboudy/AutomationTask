package InstaBug_SeleniumPages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;	
import org.openqa.selenium.safari.*;
import common.Login_BasePage;

public class Instabug_LoginPage extends Login_BasePage {
	
	public void launchBrowser(String browser) {
		
		String userDir = System.getProperty("user.dir");
		
		if(browser.equalsIgnoreCase("chrome")) {
			String chromeDriverPath = userDir + File.separator + "src" + File.separator +"drivers"+ File.separator + "chromedriver";
			System.setProperty("webdriver.chrome.driver",chromeDriverPath);	
			ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--kiosk");
			driver = new ChromeDriver(chromeOptions);
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			String firefoxDriverPath = userDir + File.separator + "src" + File.separator +"drivers"+ File.separator + "geckodriver";
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
	}	
	public void openInstabugHomepage() {
		driver.get("https://instabug.com/");
	}	
	public void clickOnLoginLink() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ; // todo:
		driver.findElement(By.xpath("//a[@href='https://dashboard.instabug.com/login']")).click();
	}
	public void userEntersEmailandPassword(String email, String password) {
		driver.findElement(By.id("developer_email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);	
	}
	public void userClicksonLoginButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	public void errorMessageDisplayed() {
		String expectedResult= "This account is already logged in";
		String actualResult= driver.findElement(By.xpath("//div[contains(text(),'This account is already logged in')]")).getText();
		assertEquals(expectedResult, actualResult);
		System.out.println("Assertion pass for the given situation");		
	}
	public void userClicksLogoutOtherSessionsButton() {
		driver.findElement(By.xpath("//button[contains(text(),'Log Out Other Sessions')]")).click();
	}
	public void userClicksonLoginWithGoogleButton() {
		driver.findElement(By.id("loginWithGoogleFirstDesign")).click();
   }
	public void userEntersGoogleEmailAndPassword(String googleEmail, String Password){
		driver.findElement(By.id("identifierId")).sendKeys(googleEmail);
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys(Password);
	}
	public void userClicksNextButtonOfGoogle() {
		driver.findElement(By.id("passwordNext]")).click();
	}
	
	public void userClicksLoginWithGitHub() {
		driver.findElement(By.id("loginWithGitHubFirstDesign")).click();
	}
	public void userEntersGithubEmailAndPassword(String email, String password) {
		driver.findElement(By.id("login_field")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	public void userClicksSigninButtonOfGithub() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	public void userClicksOnAuthorizeButton() {
		driver.findElement(By.id("authorize")).click();
	}
}
