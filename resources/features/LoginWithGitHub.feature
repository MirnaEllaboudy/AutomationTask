Feature: Instabug Login Page
This Feature verifies that user can login with multiple ways, by using email and password, 
or through google, GitHub or Microsoft

Scenario: Check that user can login with GitHub.
Given I launch Chrome browser
When I open Instabug Homepage
Then I click on Login link
And User clicks on login with GitHub button	
And User enters "mirnamoustafa5@gmail.com" and "mirna19061994"
And User clicks on Sign in button of github
And User clicks on Authorize button		