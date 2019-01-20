package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/java/resource/each_post_unique.feature" }, glue = {
		"StepDefinitions" })

public class each_post_unique_Validation extends AbstractTestNGCucumberTests {
}