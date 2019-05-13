Feature: Instabug Login Page
This Feature verifies that user can login with multiple ways, by using email and password, 
or through google, GitHub or Microsoft

Scenario: Check that user can login with google.
Given I launch Chrome browser
When I open Instabug Homepage
Then I click on Login link
And User clicks on login with google button
And User enters google "mirnatestuser5@gmail.com" and "mirnatest12345"
And User clicks on Next button of google 
And User is directed to the dashboard
And User clicks on logout button
