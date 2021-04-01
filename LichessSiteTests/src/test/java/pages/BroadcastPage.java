package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BroadcastPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main[@class='relay-index page-small box']")
	@CacheLookup
	WebElement section_broadcast;
	
	//Constructor checks if you are on the right page 
	public BroadcastPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/broadcast")) {
			throw new IllegalStateException("This is not broadcast page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void broadcastSectionIsDisplayed() {
		section_broadcast.isDisplayed();
		
	}
}
