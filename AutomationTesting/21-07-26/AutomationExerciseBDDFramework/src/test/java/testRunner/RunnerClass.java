package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features", glue = { "stepDefinition", "Hooks" }, plugin = { "pretty",
		"html:target/cucumber-report.html" }, monochrome = true, publish = true)

public class RunnerClass extends AbstractTestNGCucumberTests {

}