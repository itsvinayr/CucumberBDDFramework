@sanity
Feature: Login 
	In order to perform successful login
As a user
I want to enter correct username and password

Background: 
	Given user navigates to twitter website 
	When user validates dashboard 
	
Scenario Outline: In order to verify login to twitter 
	Then user entered the "<username>" id 
	And user entered the "<password>" pwd 
	And user select age category 
		|Age     ||location|
		|Above 18||USA     |
		|Below 18||India   |
	Then user "<validationType>" successfully logged into twitter 
	
	Examples: 
		|username|password|validationType|
		|valid|valid|should|
		|invalid|invalid|shouldnot|