package com.bdd.framework.cucumber.loginFeature.parameterize;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

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
				plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
public class RunCukeWithExtentReporting {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\test\\java\\extent-config.xml"));
	}

}
