package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingProductToCartSteps {
	String productId ;
	
	public String getProductId()
	{
		return productId;
	}
	
	@Given("I should be at the product page")
	public void i_should_be_at_the_product_page() {
		System.out.println("Nav to product page");
	}

	@When("I click on add to cart")
	public void i_click_on_add_to_cart() {
		System.out.println("Clicked on cart button");
	}

	@Then("product should get add to cart")
	public void product_should_get_add_to_cart() {
		System.out.println("Product added");
		 productId = "sdfjsdgfsjdgfjsdh";
		System.out.println("Product id generated is :" + productId);
	}

	
}
