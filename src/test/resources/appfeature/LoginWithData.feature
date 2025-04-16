Feature: Login with credentials
Scenario: login to application with credentials
Given user is at the login screen
When user enters the username as "testuser"
And user enters the password as "Test@1234"
And user click on login button number 1
Then user should be able to login 2.0