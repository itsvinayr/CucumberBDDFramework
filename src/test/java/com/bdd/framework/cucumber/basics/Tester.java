package com.bdd.framework.cucumber.basics;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tester {
	
	@Given("^I am a [a-zA-Z]{1,} Tester$")
	public void I_am_a_Manual_Tester() {
		System.out.println("-------------------------------");
		System.out.println("Given - I am a Manual Tester");
	}
	
	@When("^I apply for a job$")
	public void I_apply_for_a_job() {
		System.out.println("When - I apply for a job");
	}
	
	@Then("^I got a [a-zA-Z]{1,} pay job$")
	public void I_got_a_less_pay_job() {
		System.out.println("Then - I got a less pay job");
	}
	
	@And("^I am [a-zA-Z]{1,} satisfied with my salary$")
	public void I_am_not_satisfied_with_my_salary() {
		System.out.println("And - I am not satisfied with my salary");
	}
	
	@But("^my parents are [a-zA-Z]{1,} satisfied$")
	public void my_parents_are_still_satisfied() {
		System.out.println("But - my parents are still satisfied");
	}

}
