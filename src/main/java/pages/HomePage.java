package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id='nav-cart']")
	private WebElement cartIcon;

	@FindBy(xpath = "//*[@alt='Daily essentials']/parent::a")
	private WebElement dealSection;

	@FindBy(xpath = "//li//span//*[text()='Baby']")
	private WebElement dealsPage;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
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
		wait.until(ExpectedConditions.visibilityOf(dealSection));
		dealSection.click();
		
	}
	
	public boolean validateDailyNeedsSection()
	{
		waitForVisibilityOfElement(dealsPage);
		
		boolean isDisplayed   = dealsPage.isDisplayed();
		
		return isDisplayed;
	}

}
