package com.bdd.framework.cucumber.dataTables.understanding;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserFundingOption {
	
	@Given("^url to navigate$")
	public void url_to_navigate() throws Throwable {
	}

	@When("^user logs in with \"([^\"]*)\" and \"([^\"]*)\">$")
	public void user_logs_in_with_and(String arg1, String arg2) throws Throwable {
		System.out.println(arg1+"----"+arg2);
	}

	@Then("^check the funding_source$")
	public void check_the_funding_source(DataTable arg1) throws Throwable {
		List<String> list = arg1.asList(String.class);
		for(String s: list) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}

	@Then("^user is eligible to do a \"([^\"]*)\" transaction$")
	public void user_is_eligible_to_do_a_transaction(String arg1) throws Throwable {
		System.out.println(arg1);
	}

}
