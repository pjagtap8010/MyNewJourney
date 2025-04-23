package uiappfeatures;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivermanager.DriverFactory;
import drivermanager.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	HomePage homepage;
	public HomePageSteps()
	{
	 homepage = PageFactoryManager.getHomePage(DriverFactory.getDriver());
	}
	
	
	@Given("user is at landing page")
	public void user_is_at_landing_page() {
	  WebDriver driver = DriverFactory.getDriver();
	  
	  driver.get("https://www.amazon.in/");
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String string) {
		String title = homepage.getTitleOfPage();
		
		boolean isPresent = title.contains(string);
		
		Assert.assertEquals(isPresent, true);
	}

	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed() {
		 boolean isDispaying = homepage.isCartIconDisplayed();
		 
		 Assert.assertEquals(isDispaying, true);
	}

	@When("user clicks on deals")
	public void user_clicks_on_deals() {
	   homepage.checkoutDealsSection();
	   
	}

	@Then("user should redirect to essentials section")
	public void user_should_redirect_to_essentials_section() {
	 boolean isPresent = homepage.validateDailyNeedsSection();
	 
	 Assert.assertEquals(isPresent, true);
	}

}
