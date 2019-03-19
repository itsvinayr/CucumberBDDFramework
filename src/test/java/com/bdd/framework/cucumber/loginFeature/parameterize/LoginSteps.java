package com.bdd.framework.cucumber.loginFeature.parameterize;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	@Given("^user navigates to twitter website$")
	public void user_navigates_to_twitter_website() throws Throwable {
	    System.out.println("User navigate to twitter website");
	}

	@When("^user validates dashboard$")
	public void user_validates_dashboard() throws Throwable {
	    System.out.println("User validated dashboard");
	}

	@Then("^user entered the \"([^\"]*)\" id$")
	public void user_entered_the_id(String arg1) throws Throwable {
	    System.out.println("User entered "+arg1+" username");
	}

	@Then("^user entered the \"([^\"]*)\" pwd$")
	public void user_entered_the_pwd(String arg1) throws Throwable {
	    System.out.println("User entered "+arg1+" password");
	}

	@Then("^user \"([^\"]*)\" successfully logged into twitter$")
	public void user_successfully_logged_into_twitter(String arg1) throws Throwable {
	    System.out.println("User "+arg1+" successfully logged in");
	}

}
