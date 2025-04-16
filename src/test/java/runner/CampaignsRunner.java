package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "src\\test\\resources\\appfeature\\Campaigns.feature" },

		glue = { "steps", "hooks" },

		plugin = { "pretty" }
		


)

public class CampaignsRunner extends AbstractTestNGCucumberTests {

}
