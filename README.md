# Leadpops_Demo
This is a Demo Automation Project for Leadpops

## TestCase Automated   
| Step              | Action        | Expected | Actual        | TestData      |
| -------------     | ------------- | -------- | ------------- | ------------- |
| Navigate to App   | launch URL    | url shd be opened  | waiting for test results          | Test1         |
| Navigate to apply Page   | Click Apply Button    | Button shd be clicked and apply page launched  | waiting for test results          | Test1         |
| verify page title  | check for the page title   | page shd return correct page title  |         | Test1         |
| Go to apply Online   | Click on Apply online now     | apply page launched and apply modal appears  |         | Test1         |
| Scroll into modal view   | Page shd scroll to view modal   | page shd scroll |           | Test1         |
| Enter Test Data   | Test data entry into forms    | Data shd be entered   |          | Test1         |
| Verify error messages   | verify meesage incase of incomplete forms    | error msg shd be displayed |         | Test1         |
| Close the browser   | Close browser    | Browser shd be closed and test report generated |          | Test1         |

## Framework Used
This project was designed using a Hybrid framework consisting of Page Object Model (POM) and Data Driven Framework

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

