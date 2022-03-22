# Leadpops_Demo
This is a Demo Automation Project for Leadpops

## TestCase Automated   
| Step              | Action        | Expected | Actual        | TestData      |
| -------------     | ------------- | -------- | ------------- | ------------- |
| Navigate to App   | launch URL    | url should be opened  | waiting for test results          |  https://dollarleadclub.com/  |
| Navigate to apply Page   | Click Apply Button    | Button should be clicked and apply page launched  | waiting for test results          |         |
| verify page title  | check for the page title   | page should return correct page title  |         |      |
| Go to apply Online   | Click on Apply online now     | apply page launched and apply modal appears  |         |        |
| Scroll into modal view   | Page should scroll to view modal   | page should scroll |           |          |
| Enter Test Data   | Test data entry into forms    | Data should be entered   |          |         |
| Verify error messages   | verify message incase of incomplete forms    | error msg should be displayed |         |        |
| Close the browser   | Close browser    | Browser should be closed and test report generated |          |         |

## Framework Used
This project was designed using a Hybrid framework consisting of Page Object Model (POM)

## List of Packages and Folders
### The Package used here include
* Page Objects Package 
* testcases Package 
* Utilities package

### Page Objects Package

This package is used to store all the page elements, test logic for performing actions on the different elements and the test Data used in the project

### TestCases Package 
This package is used to store the testcases and the base class. 
The base class is used to handle all the globally used functions like before running tests and after running tests.

### Utilities Package
This package is used to store utilities like the reporting, 
