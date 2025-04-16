package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class ScenarioOutlineSteps {
	
		@Given("user has browser opened")
		public void initBrowser()
		{
			System.out.println("launch browser");
		}
		
		@When("user navigates to signup page")
		public void navToSite()
		{
			System.out.println("user reached at test site url");
		}
		
		
		@Given("user is at signup page")
		public void user_is_at_signup_page() {
		   System.out.println("Nav to signup");
		}
	
		@When("user enters name as {string} on the form")
		public void user_enters_name_as_on_the_form(String string) {
		 System.out.println("entered name as : "+string);   
		}
	
		@When("user select gender as {string}")
		public void user_select_gender_as(String string) {
		   System.out.println("selected gender as "+string);
		   
		   if(string.equals("Male"))
		   {
			   throw new RuntimeException("exception arrived hence failing....");
		   }
		}
	
		@When("user select the slot number as {int}")
		public void user_select_the_slot_number_as(Integer int1) {
		   System.out.println("Slot number is :"+int1);
		}
	
		@Then("user gets created")
		public void user_gets_created() {
		   System.out.println("user validated!!");
		}
	
	
	}
