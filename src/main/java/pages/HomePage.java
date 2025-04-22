package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='nav-cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//*[@alt='Daily essentials']/parent::a")
	private WebElement dealSection;
	
	
	@FindBy(xpath = "//li//span//*[text()='Baby']")
	private WebElement dealsPage;
	
	
	
	
	public String getTitleOfPage()
	{
		String titleOfPage = driver.getTitle();
		
		return titleOfPage;
	}
	
	
	public boolean isCartIconDisplayed()
	{
		boolean isDisplaying = cartIcon.isDisplayed();
		
		return isDisplaying;
	}
	
	
	public void checkoutDealsSection()
	{
		waitForVisibilityOfElement(dealSection);
		click(dealSection);
	}

}
