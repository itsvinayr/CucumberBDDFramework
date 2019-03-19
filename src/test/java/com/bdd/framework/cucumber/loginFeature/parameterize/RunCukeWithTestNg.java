package com.bdd.framework.cucumber.loginFeature.parameterize;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/com/bdd/framework/cucumber/loginFeature/parameterize"},
				glue= {"com/bdd/framework/cucumber/loginFeature/parameterize"},
				monochrome=true,
				tags = {"@sanity"})
public class RunCukeWithTestNg extends AbstractTestNGCucumberTests{

}
