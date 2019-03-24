package com.bdd.framework.cucumber.dataTables.json;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RefundOptionSteps {
	
	@Given("^test url to navigate$")
	public void test_url_to_navigate() throws Throwable {
	}

	@When("^end user logs with \"([^\"]*)\"$")
	public void end_user_logs_with(String arg1) throws Throwable {
		UserData data = new JsonDataReader().getDataByUserName(arg1);
		System.out.println(data.getUsername()+"----"+data.getPassword());
	}

	@Then("^check the refund option source$")
	public void check_the_refund_option_source(DataTable arg1) throws Throwable {
		List<String> list = arg1.asList(String.class);
		for(String s: list) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}

	@Then("^end user is eligible to do a \"([^\"]*)\" transaction$")
	public void end_user_is_eligible_to_do_a_transaction(String arg1) throws Throwable {
		System.out.println(arg1);
	}

}
