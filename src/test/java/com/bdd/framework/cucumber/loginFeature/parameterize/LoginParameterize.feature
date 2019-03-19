Feature: Login
In order to perform successful login
As a user
I want to enter correct username and password

Scenario Outline: In order to verify login to twitter
	Given user navigates to twitter website
	When user validates dashboard
	Then user entered the "<username>" id
	And user entered the "<password>" pwd
	Then user "<validationType>" successfully logged into twitter
	
Examples:
|username|password|validationType|
|valid|valid|should|
|invalid|invalid|shouldnot|