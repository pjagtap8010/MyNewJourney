package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmSteps {
	
	AddingProductToCartSteps apc;
	
	public OrderConfirmSteps(AddingProductToCartSteps apc)
	{
		this.apc = apc;
	}
	
	@When("I click on place order")
	public void i_click_on_place_order() {
		System.out.println("Clicked to place the order");
	}

	@Then("Order should get placed")
	public void order_should_get_placed() {
		System.out.println("Order confirmed");
		String productId = apc.getProductId();
		System.out.println("validated product is :"+productId);
	}


}
