package uiappfeatures;

import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	
	WebDriver driver ;
	@Before
	public void launchBrowser()
	{
		DriverFactory df = new DriverFactory();
		
	driver	= df.initBrowser("Chrome");
	
	driver.manage().window().maximize();
	}
	
	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
