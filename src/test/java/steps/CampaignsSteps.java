package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignsSteps {
	
	@Given("user is at campaigns page")
	public void user_is_at_campaigns_page() {
	   System.out.println("Navigate to campaigns page");
	}

	@When("user clicks on create campaign button")
	public void user_clicks_on_create_campaign_button() {
	   System.out.println("Clicked on campaign");
	}

	@When("user enters the information")
	public void user_enters_the_information() {
	   System.out.println("Entered the info"); 
	}

	@Then("campaign should get created")
	public void campaign_should_get_created() {
	   System.out.println("Campaign created"); 
	}

	@When("user clicks on edit campaign")
	public void user_clicks_on_edit_campaign() {
	   System.out.println("Campaign edited");
	}

	@When("user enters the time")
	public void user_enters_the_time() {
	    System.out.println("Time defined");
	}

	@Then("campaign should get scheduled")
	public void campaign_should_get_scheduled() {
	   System.out.println("Campaign scheduled validated");
	}

	@Then("campaign status should get sent")
	public void campaign_status_should_get_sent() {
	   System.out.println("Campaigns status validated");
	}

}
