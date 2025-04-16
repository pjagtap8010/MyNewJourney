Feature: Order information
Background:
Given user is at order page
When user click on orders button

Scenario: fetch currently placed order information
When user click on recent orders
Then user should see the current order information

Scenario: fetch previously placed order information
When user click on previous order
Then user should see previously placed order information

Scenario: fetch cancelled order information
When user click on cancelled order
Then user should see the cancelled order information