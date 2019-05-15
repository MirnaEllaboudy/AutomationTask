Feature: Instabug Login Page
This Feature verifies that user can login with multiple ways, by using email and password, 
or through google, GitHub or Microsoft

Scenario: Check that user can login through Microsoft account
Given I launch Chrome browser
When I open Instabug Homepage
Then I click on Login link
And User clicks on login with microsoft button
And User enters microsoft "mirnadummy@hotmail.com" and "mirna1234"
And User clicks on Next button of microsoft
And User is directed to the dashboard
And User clicks on logout button



