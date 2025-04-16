package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {

	@Given("user is at account page")
	public void user_is_at_account_page() {
		System.out.println("nav to account page");
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();

		List<String> zerothList = data.get(0);

		System.out.println(zerothList);

		String lastName = zerothList.get(1);

		System.out.println("lastname is " + lastName);

		String email = data.get(0).get(2);
		System.out.println(email);
		System.out.println("***************************************************");

		List<Map<String, String>> mapData = dataTable.asMaps();

		Map<String, String> list1 = mapData.get(1);

		String phoneNumber = list1.get("phone");

		System.out.println(phoneNumber);
		
		

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("Clicked on submit");
	}

	@Then("user should get confirmation")
	public void user_should_get_confirmation() {
		System.out.println("account creation validated!!");
	}

}
