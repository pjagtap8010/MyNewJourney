Feature: Profile functionality validation
Scenario: Addition of profile
Given I have logged into the application
And I am at home page
When I click on add button
And I enter the data
Then Profile should get added

Scenario: updation of profile
Given I have logged into the application
And I am at home page
When I click on edit button
And I update the data
Then Profile should get updated

Scenario: Deletion of profile
Given I have logged into the application
And I am at home page
When I click on delete button
Then Profile should get deleted