package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@RunWith(SerenityRunner.class)

@CucumberOptions(
		features="src/test/java/featureFiles",
		glue= {"greenfield1.stepDefinition"},
		monochrome = true
		//format = {"pretty",
		
		)
		
public class Runner {

}
