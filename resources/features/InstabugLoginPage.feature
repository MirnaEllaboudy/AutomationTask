Feature: Instabug Login Page
This Feature verifies that user can login with multiple ways, by using email and password, 
or through google, GitHub or Microsoft

Scenario: Check that user can login through username and password.
Given I launch Chrome browser
When I open Instabug Homepage
Then I click on Login link
And User enters "mirnamoustafa5@gmail.com" and "mirna1234"
And User clicks on login button
And User is directed to the dashboard



Scenario: Check that user cannot login with the same account multiple times(doesnot allow multiple sessions at one time).
Given I launch Chrome browser
When I open Instabug Homepage
Then I click on Login link
And User enters "mirnamoustafa5@gmail.com" and "mirna1234"
And  User clicks on login button
And error message is displayed
And User clicks log out	other sessions button
And User is directed to the dashboard
And User clicks on logout button



Scenario: Verify that Forgot password link and Sign up link are displayed
When  I open Instabug Homepage
Then I click on Login link
And Forgot password is displayed
And User clicks on back to login
And Sign up is displayed

