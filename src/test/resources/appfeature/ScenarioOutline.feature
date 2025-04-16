Feature: Signup functionality
Background:
Given user has browser opened
When user navigates to signup page

Scenario Outline: signup to application
Given user is at signup page
When user enters name as "<name>" on the form
And user select gender as "<gender>"
And user select the slot number as <slotnumber>
Then user gets created

Examples:
| name | gender | slotnumber |
| Eder | Male | 1 |
| Ron | Male | 2 |
| Diana | Female | 3 |
| Alex | Male | 5 |