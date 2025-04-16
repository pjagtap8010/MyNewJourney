package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithData {
	@Given("user is at the login screen")
	public void user_is_at_the_login_screen() {
	  System.out.println("navigate to login screen");
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
	    System.out.println("Entered username as :"+uname);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
	  System.out.println("entered password as "+string);
	}

	@When("user click on login button number {int}")
	public void user_click_on_login_button(Integer int1) {
	   System.out.println("Clicked on login!! and the received number is :"+int1);
	}

	@Then("user should be able to login {double}")
	public void user_should_be_able_to_login(Double double1) {
	    System.out.println("User logged in and the data is : "+double1);
	}


}
