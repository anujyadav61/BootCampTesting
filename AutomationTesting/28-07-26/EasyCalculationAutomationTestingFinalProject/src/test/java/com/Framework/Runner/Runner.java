package com.Framework.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/Features",

		glue = "com.Framework.StepDefinitions",

		plugin = {

				"pretty",

				"html:target/CucumberReport.html"

		},

		monochrome = true

)

public class Runner extends AbstractTestNGCucumberTests {

}