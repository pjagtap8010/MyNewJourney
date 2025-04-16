package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	
	// CTRL + SHIFT + O
	
	@Given("user is at order page")
	public void user_is_at_order_page() {
	  System.out.println("Nav to orders page");
	}

	@When("user click on orders button")
	public void user_click_on_orders_button() {
	   System.out.println("handling order button");
	}

	@When("user click on recent orders")
	public void user_click_on_recent_orders() {
	    System.out.println("clicked on current order");
	}

	@Then("user should see the current order information")
	public void user_should_see_the_current_order_information() {
	   System.out.println("current order information validated!!!");
	}

	@When("user click on previous order")
	public void user_click_on_previous_order() {
		System.out.println("clicked on previous order");
	}

	@Then("user should see previously placed order information")
	public void user_should_see_previously_placed_order_information() {
		System.out.println("previous order information validated!!!");
	}

	@When("user click on cancelled order")
	public void user_click_on_cancelled_order() {
		System.out.println("clicked on cancelled order");
	}

	@Then("user should see the cancelled order information")
	public void user_should_see_the_cancelled_order_information() {
		System.out.println("cancelled order information validated!!!");
	}


}
