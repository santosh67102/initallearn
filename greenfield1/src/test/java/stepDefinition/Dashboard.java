package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author A634025
 *Lead to dash board for tab selection
 */
public class Dashboard {
	WebDriver driver;
	
	@Before()
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A634025\\eclipse-workspace\\greenfield1\\src\\test\\java\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	}
	
	
	@Given("^User is in the landing page of \"([^\"]*)\"$")
	public void user_is_in_the_landing_page_of(String greenfield) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("greenfield");
	   driver.get("http://gfr-dev-www.fmr.com");
	   Thread.sleep(2000);
	}

	@When("^User clicks on the link for \"([^\"]*)\"$")
	public void user_clicks_on_the_link_for(String application_cluster) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user_clicks_on_the_link_for_application_cluster");
		driver.findElement(By.linkText("FBCP Application Clusters")).click();
	}

	@Then("^User is directed to page$")
	public void user_is_directed_to_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user_is_directed_to_page");
	}

	@Then("^User clicks on the dashboard link \"([^\"]*)\"$")
	public void user_clicks_on_the_dashboard_link(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user_clicks_on_the_dashboard_link");
		
	}

	@Then("^User is directed to dashboard$")
	public void user_is_directed_to_dashboard() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^User clicks on different tab$")
	public void user_clicks_on_different_tab() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^User is directed to that pages$")
	public void user_is_directed_to_that_pages() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

}