package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@RunWith(SerenityRunner.class)

@CucumberOptions(
		features="C:\\Users\\A634025\\git\\localrepository\\greenfield1\\src\\test\\java\\featureFiles\\home.feature",
		glue= {"stepDefinition"},
		monochrome = true
		//format = {"pretty",
		
		)
		
public class Runner {
	public void runner() {
		
	}

	
}
