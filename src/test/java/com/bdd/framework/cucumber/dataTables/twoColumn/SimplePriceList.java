package com.bdd.framework.cucumber.dataTables.twoColumn;

import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SimplePriceList {

	private Map<String, Integer> priceList;
	private int totalSum;

	@Given("^the price list for a coffee shop$")
	public void the_price_list_for_a_coffee_shop(Map<String, Integer> priceList) throws Throwable {
		this.priceList = priceList;
	}

	@When("^I order (\\d+) (.*) and (\\d+) (.*)$")
	public void i_order_coffee_and_donut(int numberOfFirstItems, String firstItem, int numberOfSecondItems,
			String secondItem) throws Throwable {
		int firstPrice = priceList.get(firstItem);
        int secondPrice = priceList.get(secondItem);
        totalSum += firstPrice * numberOfFirstItems;
        totalSum += secondPrice * numberOfSecondItems;
	}

	@Then("^should I pay (\\d+)$")
	public void should_I_pay(int expectedCost) throws Throwable {
		assertThat(totalSum, is(expectedCost));
	}

}
