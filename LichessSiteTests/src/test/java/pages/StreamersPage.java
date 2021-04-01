package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StreamersPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='page-menu__content box streamer-list']")
	@CacheLookup
	WebElement section_streamers;
	
	//Constructor checks if you are on the right page 
	public StreamersPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/streamer")) {
			throw new IllegalStateException("This is not streamer page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void streamerSectionIsDisplayed() {
		section_streamers.isDisplayed();
		
	}
}
