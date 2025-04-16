	@campaign
	Feature: Campaign functionality
	@sanity @regression
	Scenario: create campaign
	Given user is at campaigns page
	When user clicks on create campaign button
	And user enters the information
	Then campaign should get created
	
	@regression
	Scenario: Schedule a campaign
	Given user is at campaigns page
	When user clicks on edit campaign
	And user enters the time
	Then campaign should get scheduled
	
	@functional
	Scenario: Send campaign
	Given user is at campaigns page
	Then campaign status should get sent