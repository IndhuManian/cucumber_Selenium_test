package TestRunner;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/Features",
	    glue = {"StepDefinitions","Hooks"},
	    tags="@title",
	    plugin = {"pretty", "html:target/cucumber-reports.html"},
	    dryRun= false
	)
public class TestRunner {
	

}
