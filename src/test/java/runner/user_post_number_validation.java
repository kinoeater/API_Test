package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/java/resource/User_Post_Count.feature" }, glue = {
		"StepDefinitions" })

public class user_post_number_validation extends AbstractTestNGCucumberTests {
}