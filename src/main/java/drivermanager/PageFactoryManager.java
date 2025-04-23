package drivermanager;

import org.openqa.selenium.WebDriver;

import pages.HomePage;

public class PageFactoryManager {
	
public static	HomePage homepage;
	
public static HomePage getHomePage(WebDriver driver) {

	if (homepage == null) {
		return new HomePage(driver);
	} else {
		return homepage;
	}
}
	
	

}
