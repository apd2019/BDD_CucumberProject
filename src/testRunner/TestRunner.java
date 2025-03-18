package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/feature/DataParameterExample.feature", 
		glue = "stepDefinitions", 
		plugin = { "pretty",
				"html:target/cucumber-html-report.html",
				 "json:target/cucumber-json-report.json", "junit:target/cucumber-xml-report.xml" } )

public class TestRunner {

}
		