package InstaBug_SeleniumPages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.*;
import common.Login_BasePage;

public class Instabug_LoginPage extends Login_BasePage {

	public void launchBrowser(String browser) {

		String userDir = System.getProperty("user.dir");

		if (browser.equalsIgnoreCase("chrome")) {
			String chromeDriverPath = userDir + File.separator + "resources" + File.separator + "drivers" + File.separator
					+ "chromedriver";
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--kiosk");
			driver = new ChromeDriver(chromeOptions);
		} else if (browser.equalsIgnoreCase("firefox")) {
			String firefoxDriverPath = userDir + File.separator + "resources" + File.separator + "drivers" + File.separator
					+ "geckodriver";
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} 				
	}

	public void openInstabugHomepage() {
		driver.get("https://instabug.com/");
	}

	public void clickOnLoginLink() {
		waitForVisabilty(By.xpath("//a[@href='https://dashboard.instabug.com/login']"), 30);
		driver.findElement(By.xpath("//a[@href='https://dashboard.instabug.com/login']")).click();

	}

	public void userEntersEmailandPassword(String email, String password) {
		waitForVisabilty(By.id("developer_email"),30);
		driver.findElement(By.id("developer_email")).sendKeys(email);
		waitForVisabilty(By.id("password"),30);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	public void userClicksonLoginButton() {
		waitForVisabilty(By.xpath("//button[@type='submit']"), 30);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public void userIsDirectedToTheDashboard() {
		try {	
		String expectedResult= "https://dashboard.instabug.com/welcome-to-instabug";
		waitForURLNavigation("https://dashboard.instabug.com/welcome-to-instabug",30);
		String result= driver.getCurrentUrl();
		assertEquals(expectedResult,result );
		System.out.println("Assertion passed, User is directed to the dashboard");
		}catch (Exception e) {
		 System.out.println("Assertion failed, User is not directed to the dashboard ");
		}
	}
	public void userClicksOnLogoutButton() {
		if(driver.findElements(By.className("toast-close-button")).size() > 0) {
			driver.findElement(By.className("toast-close-button")).click();
		}
		waitForVisabilty(By.className("-profile"),40);
		System.out.println(driver.findElement(By.className("-profile")).findElement(By.tagName("span")).findElement(By.tagName("a")).getText());
		driver.findElement(By.className("-profile")).findElement(By.tagName("span")).findElement(By.tagName("a")).click();
		List<WebElement> profileOptions=driver.findElement(By.className("-profile")).findElements(By.tagName("li"));
		int lastOption =profileOptions.size()-1;
		System.out.println(lastOption);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(profileOptions.get(lastOption).findElement(By.tagName("a")).getText());
		profileOptions.get(lastOption).findElement(By.tagName("a")).click();
	}
	public void forgotPasswordIsDisplayed() {
		try {
		waitForVisabilty(By.xpath("//a[@href='/forgot']"), 40);
		driver.findElement(By.xpath("//a[@href='/forgot']")).click();
		String expectedResult= "https://dashboard.instabug.com/forgot";
		waitForURLNavigation("https://dashboard.instabug.com/forgot",30);
		String retrievedResult= driver.getCurrentUrl();
		assertEquals(expectedResult,retrievedResult);
		System.out.println("Assertion passed, User is directed to forgot password page");
		}catch (Exception e) {
			System.out.println("Assertion failed, user is not directed to Forgot Password page");
		}
	}
	public void errorMessageDisplayed() {
		try {
		String expectedResult = "This account is already logged in";
		waitForVisabilty(By.xpath("//div[contains(text(),'This account is already logged in')]"), 30);
		String actualResult = driver.findElement(By.xpath("//div[contains(text(),'This account is already logged in')]")).getText();
		assertEquals(expectedResult, actualResult);
		System.out.println("Assertion passed for multiple session flow");
		}catch(Exception e) {
			System.out.println("Assertion failed, multiple session error message is not displayed");
		}
	}

	public void userClicksLogoutOtherSessionsButton() {
		waitForVisabilty(By.xpath("//button[contains(text(),'Log Out Other Sessions')]"), 30);
		driver.findElement(By.xpath("//button[contains(text(),'Log Out Other Sessions')]")).click();
	}
	
	public void userClicksOnBackToLogin() {
		waitForVisabilty(By.xpath("//a[@href='/login']"), 30);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	}
	
	public void signUpIsDisplayed() {
		try {
		waitForVisabilty(By.xpath("//a[@href='/signup']"), 30);
		driver.findElement(By.xpath("//a[@href='/signup']")).click();
		String expectedResult="https://dashboard.instabug.com/signup";
		waitForURLNavigation("https://dashboard.instabug.com/signup",30);
		String retrievedResult= driver.getCurrentUrl();
		assertEquals(expectedResult,retrievedResult);
		System.out.println("Assertion passed, user is directed to the sign up page");
		}catch (Exception e) {
			System.out.println("Assertion Failed, user is not directed to the sign up page");
		}
	}

	public void userClicksonLoginWithGoogleButton() {
		waitForVisabilty(By.id("loginWithGoogleFirstDesign"), 30);
		driver.findElement(By.id("loginWithGoogleFirstDesign")).click();
	}

	public void userEntersGoogleEmailAndPassword(String googleEmail, String Password) {
		waitForVisabilty(By.id("identifierId"), 30);
		driver.findElement(By.id("identifierId")).sendKeys(googleEmail);
		waitForVisabilty(By.id("identifierNext"), 30);
		driver.findElement(By.id("identifierNext")).click();
		waitForVisabilty(By.name("password"), 30);
		driver.findElement(By.name("password")).sendKeys(Password);
	}

	public void userClicksNextButtonOfGoogle() {
		waitForVisabilty(By.id("passwordNext"), 30);
		driver.findElement(By.id("passwordNext")).click();
	}

	public void userClicksLoginWithGitHub() {
		waitForVisabilty(By.id("loginWithGitHubFirstDesign"), 30);
		driver.findElement(By.id("loginWithGitHubFirstDesign")).click();
	}

	public void userEntersGithubEmailAndPassword(String email, String password) {
		waitForVisabilty(By.id("login_field"), 30);
		driver.findElement(By.id("login_field")).sendKeys(email);
		waitForVisabilty(By.id("password"), 30);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	public void userClicksSigninButtonOfGithub() {
		waitForVisabilty(By.xpath("//input[@type='submit']"), 30);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	public void userClicksOnLoginWithMicrosoftButton() {
		waitForVisabilty(By.className("c-authentication__microsoft-button"),30);
		driver.findElement(By.className("c-authentication__microsoft-button")).click();
	
	}
	
	public void userEntersMicrosoftEmailAndPassword(String email, String password) {
		waitForVisabilty(By.id("i0116"), 30);
		driver.findElement(By.id("i0116")).sendKeys(email);
		driver.findElement(By.id("idSIButton9")).click();
		waitForVisabilty(By.id("i0118"), 30);
		driver.findElement(By.id("i0118")).sendKeys(password);	
	}
	
	public void userClicksOnNextButtonOfMicrosoft() {
		driver.findElement(By.id("idSIButton9")).click();
	}
}
