package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefinitions","Hooks"},
        tags = "@pincode",
        plugin = {"pretty","html:target/cucumber-reports.html","rerun:target/failed_scenarios.txt"},
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {

 
    
    
  
}