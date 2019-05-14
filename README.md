# AutomationTask Content
# Description:

This project consists of 5 Packages as shown below:
- Resources -> Features: This folder contains the English representation of test cases that cover all the scenarios for the login flow with its different options.


- StepDefinitions: This package is the linkage between the feature file and the actual Selenium code that interacts with the elements on a WebPage, where in this package the methods behind each step in a scenario mentioned in the feature file is implemented. 


- InstaBug_SeleniumPages: This package contains the actual Selenium code for each and every step mentioned in the feature file that covers the login flow and drives the test scripts.


- TestRunners: This contains the TestRunner_InstaBugLoginPage class to be used by BDD


- Common: This package contains the Login_BasePage class which contains the common variable,methods used by most of classes.


The Features folder consists of 4 files:

- InstabugLoginPage.feature: This file contains the scenarios of logging in by email and password. also covers the scenario of multiple sessions at one time and verifies that Forgot password link and Sign up link are displayed.


- LoginWithGitHub: This file covers the flow of logging in through GitHub account.


- LoginWithGoogle: This file covers the flow of logging in through google mail.


- LoginWithMicrosoft: This file covers the flow of logging in through microsoft account.


# Configuration before Running

- The project by default will run all the feature files, if a specific feature file is needed to be run, change the path mentioned in the TestRunnner_class to be features="resources/features/Feature File Name instead of features="resources/features".


- The project by default will run on Chrome browser,the project can run on a multiple browsers, the browser can be changed from the feature file, first step to be "I launch BrowserName browser" instead of "I launch Chrome browser".


- The project is set by default to a testing data, data (email, password, browser) can be changed from the feature file.


# How to run?

- Import the project as Existing Maven Project

- Right click to update the Maven dependencies.

To run with BDD JUnit:

- Right Click on TestRunner_InstaBugLoginPage class and select run as JUnit.

- Reading test data from feature file


# Libraries/Plugins used

- Selenium: To initiate the driver and deal with the web elements.

- Cucumber: To enable writing the test scripts in BDD format.

- Junit: Used for test annotations , asserting on the results with BDD.

- List: to handle list.


