package stepDefinitions;

import InstaBug_SeleniumPages.Instabug_LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class stepDefs_InstabugLoginPage {
	
	Instabug_LoginPage loginPage = new Instabug_LoginPage();
	
	@Given("^I launch (Chrome|Firefox|Safari) browser$")
	public void I_Launch_browser(String browser)throws Exception {
		loginPage.launchBrowser(browser);		
	}
	
	@When("^I open Instabug Homepage$")
	public void I_open_Instabug_Homepage()throws Exception {
		loginPage.openInstabugHomepage();		
	}
	
	@Then("^I click on Login link$")
	public void I_click_on_Login_link()throws Exception {
		loginPage.clickOnLoginLink();		
	}
	
	@And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_Email_and_Password(String email, String password) throws Exception {
		loginPage.userEntersEmailandPassword(email,password);		
	}
	
	@And("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Exception{
		loginPage.userClicksonLoginButton();
		
	}
	
	@And("^error message is displayed$")
	public void error_message_is_displayed() throws Exception{
		loginPage.errorMessageDisplayed();
	}
	
	@And("^User clicks log out	other sessions button")
	public void user_clicks_logout_other_sessions_button() throws Exception{
		loginPage.userClicksLogoutOtherSessionsButton();
	}
}
