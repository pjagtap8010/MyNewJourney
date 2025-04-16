package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class LoginSteps {
		@When("I click on login button")
		public void clickingOnLogin()
		{
			System.out.println("Clicked on login");	
		}
		
		
		@Given("I am at the login page")
		public void goToLoginPage()
		{
			System.out.println("Reached to login page!!");
		}
	
		@When("I enter the credentials")
		public void enteringCredentials()
		{
			System.out.println("Credentials entered");
		}
		
		
		
		@Then("I should be able to login")
		public void validatingLogin()
		{
			System.out.println("Login verified");
		}
		
	//	@Given("I am at the login page")
	//	public void goToLogin()
	//	{
	//		System.out.println("Navigating to login");
	//	}
		
		@Then("page title should be verified")
		public void validateTitle()
		{
			System.out.println("Title validated!!!");
		}
		
		
	}
