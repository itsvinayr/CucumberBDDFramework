Feature: Login
In order to perform successful login
As a user
I want to enter correct username and password

Scenario Outline: In order to verify login to facebook
	Given user navigates to facebook website
	When user validates homepage title
	Then user entered the "<valid>" username
	And user entered the "<valid>" password
	Then user "<shouldbe>" successfully logged in
	
Examples:
|username|password|validationType|
|valid|valid|should|
|invalid|invalid|shouldnot|