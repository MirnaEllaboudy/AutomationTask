package stepDefinitions;

import InstaBug_SeleniumPages.Instabug_LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class stepDefs_InstabugLoginPage {
	
	Instabug_LoginPage loginPage = new Instabug_LoginPage();
	
	@Given("^I launch (Chrome|FireFox) browser$")
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
	
	@And("^User is directed to the dashboard$")
	public void user_is_directed_to_the_dashboard() throws Exception{
		loginPage.userIsDirectedToTheDashboard();
	}
	@And("^User clicks on logout button$")
	public void user_clicks_on_logout_button() throws Exception{
		loginPage.userClicksOnLogoutButton();
	}
	
	@And("^error message is displayed$")
	public void error_message_is_displayed() throws Exception{
		loginPage.errorMessageDisplayed();
	}
	
	@And("^User clicks log out	other sessions button")
	public void user_clicks_logout_other_sessions_button() throws Exception{
		loginPage.userClicksLogoutOtherSessionsButton();
	}
	
	@And("^Forgot password is displayed$")
	public void forgot_password_is_displayed() throws Exception{
		loginPage.forgotPasswordIsDisplayed();
	}
	@And("^User clicks on back to login$")
	public void user_clicks_on_back_to_login() throws Exception{
		loginPage.userClicksOnBackToLogin();
	}
	@And("^Sign up is displayed$")
	public void sign_up_is_displayed() throws Exception{
		loginPage.signUpIsDisplayed();
	}
	
	@And("^User clicks on login with google button$")
	public void user_clicks_on_login_with_google_button() throws Exception{
		loginPage.userClicksonLoginWithGoogleButton();
	}
	@And("^User enters google \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_google_email_and_password(String googleEmail, String Password) throws Exception{
		loginPage.userEntersGoogleEmailAndPassword(googleEmail, Password);
	}
	@And("^User clicks on Next button of google$")
	public void user_clicks_on_Next_button_of_google() throws Exception{
		loginPage.userClicksNextButtonOfGoogle();
	}
	@And("^User clicks on login with GitHub button")
	public void user_clicks_on_login_with_GitHub_button() throws Exception{
		loginPage.userClicksLoginWithGitHub();
	}
	@And("^User enters github \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_github_email_and_password(String email, String password) throws Exception{
		loginPage.userEntersGithubEmailAndPassword(email, password);
	}
	@And("^User clicks on Sign in button of github")
	public void user_clicks_on_Sign_in_button_of_github() throws Exception{
		loginPage.userClicksSigninButtonOfGithub();
	}
	@And("^User clicks on login with microsoft button$")
	public void user_clicks_on_login_with_microsoft_button() throws Exception{
		loginPage.userClicksOnLoginWithMicrosoftButton();
	}
	@And("^User enters microsoft \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_microsoft_email_and_password(String email,String password) throws Exception {
		loginPage.userEntersMicrosoftEmailAndPassword(email, password);
	}
	@And("^User clicks on Next button of microsoft$")
	public void user_clicks_on_Next_button_of_microsoft() throws Exception{
		loginPage.userClicksOnNextButtonOfMicrosoft();
	}
	@And("^Validation error message is displayed$")
	public void validation_error_message_is_displayed() throws Exception{
		loginPage.validationErrorMessageIsDisplayed();
	}
}
