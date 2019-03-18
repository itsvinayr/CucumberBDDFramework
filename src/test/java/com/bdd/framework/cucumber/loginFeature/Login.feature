Feature: Login
In order to perform successful login
As a user
I want to enter correct username and password

Scenario: In order to verify login to facebook
	Given user navigates to facebook website
	When user validates homepage title
	Then user entered the "valid" username
	And user entered the "valid" password
	Then user "shouldbe" successfully logged in
	
Scenario: In order to verify login to facebook as invalid user
	Given user navigates to facebook website
	When user validates homepage title
	Then user entered the "invalid" username
	And user entered the "invalid" password
	Then user "shouldnot" successfully logged in