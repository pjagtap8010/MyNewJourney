package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	

@Given("I have logged into the application")
public void i_have_logged_into_the_application() {
   System.out.println("Logged in");
}

@Given("I am at home page")
public void i_am_at_home_page() {
    System.out.println("nav to home page");
}

@When("I click on add button")
public void i_click_on_add_button() {
    System.out.println("Clicked on add");
}

@When("I enter the data")
public void i_enter_the_data() {
    System.out.println("data addded");
}

@Then("Profile should get added")
public void profile_should_get_added() {
   System.out.println("profile addition validated");
}

@When("I click on edit button")
public void i_click_on_edit_button() {
	System.out.println("Clicked on edit");
}

@When("I update the data")
public void i_update_the_data() {
	System.out.println("data updated");
}

@Then("Profile should get updated")
public void profile_should_get_updated() {
	System.out.println("Profile updated");
}

@When("I click on delete button")
public void i_click_on_delete_button() {
	System.out.println("Clicked on delete");
}

@Then("Profile should get deleted")
public void profile_should_get_deleted() {
  System.out.println("profile deleted!!");
}


}
