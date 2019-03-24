package com.bdd.framework.cucumber.dataTables.oneColumn;

import static org.junit.Assert.assertThat;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;

public class ArithmaticSteps {
	
	private List<Integer> numbers;
	private int sum;
	
	@Given("^a list of numbers$")
	public void a_list_of_numbers(List<Integer> numbers) throws Throwable {
		this.numbers=numbers;
	}

	@When("^I summarize them$")
	public void i_summarize_them() throws Throwable {
		for(Integer n: numbers) {
			sum+=n;
		}
	}

	@Then("^I should get (\\d+)$")
	public void i_should_get(int expectedSum) throws Throwable {
		assertThat(sum, is(expectedSum));
	}

}
