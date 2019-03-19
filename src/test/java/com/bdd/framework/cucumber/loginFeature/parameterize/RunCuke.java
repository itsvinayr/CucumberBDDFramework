package com.bdd.framework.cucumber.loginFeature.parameterize;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/*
 * Mention cucumber option if feature and step files are in different packages
 * monochrome just for formatting
 */
@CucumberOptions(features= {"src/test/java/com/bdd/framework/cucumber/loginFeature/parameterize"},
				glue= {"com/bdd/framework/cucumber/loginFeature/parameterize"},
				monochrome=true,
				tags = {"@sanity"},
				plugin = {"pretty", "html:target/cucumber"})
public class RunCuke {

}
