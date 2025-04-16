package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "src\\test\\resources\\appfeature\\Orders.feature" },

		glue = { "steps", "hooks" },
		
		plugin = {"pretty"},
		
		publish = true

)

public class OrdersRunner extends AbstractTestNGCucumberTests {

}
