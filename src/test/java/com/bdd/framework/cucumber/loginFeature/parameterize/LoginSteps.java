package com.bdd.framework.cucumber.loginFeature.parameterize;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	// Adding hooks which runs before and after test and can be controlled by tags
	@Before("@sanity")
	public void setUp() {
		System.out.println("Launch browser");
	}

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
		System.out.println("User entered " + arg1 + " username");
	}

	@Then("^user entered the \"([^\"]*)\" pwd$")
	public void user_entered_the_pwd(String arg1) throws Throwable {
		System.out.println("User entered " + arg1 + " password");
	}

	/**
	 * Adding list
	 * 
	 * @param list
	 * @throws Throwable
	 */

	/*
	 * @Then("^user select age category$") public void
	 * user_select_age_category(List<String> list) throws Throwable {
	 * System.out.println("User select age category "+list.get(2)); }
	 */

	/**
	 * if parameters are more, we user datatables
	 * @param list
	 * @throws Throwable
	 */
	@Then("^user select age category$")
	public void user_select_age_category(DataTable table) throws Throwable {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		System.out.println("User select age category "+data.get(0).get("Age")+"---"+data.get(0).get("location"));
	}

	@Then("^user \"([^\"]*)\" successfully logged into twitter$")
	public void user_successfully_logged_into_twitter(String arg1) throws Throwable {
		System.out.println("User " + arg1 + " successfully logged in");
	}
	
	@After("@sanity")
	public void tearDown() {
		System.out.println("quit browser");
	}

}
