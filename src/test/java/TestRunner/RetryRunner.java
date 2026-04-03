
	package TestRunner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
	        features = "@target/failed_scenarios.txt",
	        glue = {"StepDefinitions","Hooks"},
	        plugin = {"pretty","html:target/cucumber-rerun.html"}
	)
	public class RetryRunner extends AbstractTestNGCucumberTests {
	}


