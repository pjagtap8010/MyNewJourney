package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public BasePage() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void clearAndSendkeys(WebElement element, String value) {
		element = waitForVisibilityOfElement(element);
		element.clear();
		element.sendKeys(value);
	}
	
	public void click(WebElement element)
	{
		waitForElementToBeClickable(element).click();
		
	}

	public WebElement waitForVisibilityOfElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public WebElement waitForElementToBeClickable(WebElement element)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
