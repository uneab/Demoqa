package afasf.Demoq;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefiniton {
	public String text;
	
	@Given("^user enters the page$")
	public void user_enters_the_page() {
		Base.browseropen();
		Base.launchApp("http://demoqa.com/registration/");
	}

	
	@When("^user gives the data$")
	public void user_gives_the_data() throws Throwable {
	POM obj=new POM();
	obj.getFirstname().sendKeys("uneab");
	obj.getLastname().sendKeys("showkatj");
	}

	@Then("^User verifies the data$")
	public void user_verifies_the_data() throws Throwable {
	POM obj=new POM();
	Assert.assertTrue(obj.getFirstname().getAttribute("value").equals("uneab"));
	Assert.assertTrue(obj.getLastname().getAttribute("value").equals("showkath"));
	}
	

}
