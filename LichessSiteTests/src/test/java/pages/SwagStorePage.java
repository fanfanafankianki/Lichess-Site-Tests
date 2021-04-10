package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagStorePage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='sprd-Wrapper']")
	@CacheLookup
	WebElement swag_footer;
	
	//Constructor checks if you are on the right page 
	public SwagStorePage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://shop.spreadshirt.com/lichess-org")) {
			throw new IllegalStateException("This is not Swag Store page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void swag_footerIsDisplayed() {
		swag_footer.isDisplayed();
		
	}
}
