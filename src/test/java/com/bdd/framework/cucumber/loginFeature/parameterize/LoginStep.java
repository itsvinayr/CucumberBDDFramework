package com.bdd.framework.cucumber.loginFeature.parameterize;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
	    System.out.println("@Given - user navigates to facebook website");
	}

	@When("^user validates homepage title$")
	public void user_validates_homepage_title() throws Throwable {
		System.out.println("@when - user validates homepage title");
	}

	@Then("^user entered the \\\"([^\\\"]*)\\\" username$")
	public void user_entered_the_valid_username(String username) throws Throwable {
	    System.out.println("@Then - user entered "+username+" the username");
	}

	@Then("^user entered the \\\"([^\\\"]*)\\\" password$")
	public void user_entered_the_valid_password(String password) throws Throwable {
	    System.out.println("@Then - user entered "+password+" the password");
	}

	@Then("^user \\\"([^\\\"]*)\\\" successfully logged in$")
	public void user_shouldbe_successfully_logged_in(String validateLogin) throws Throwable {
	    System.out.println("@Then - user "+validateLogin+" should be successfully logged in");
	}

}
