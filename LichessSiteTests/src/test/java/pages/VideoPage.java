package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VideoPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='list box__pad infinite-scroll']")
	@CacheLookup
	WebElement section_video;
	
	//Constructor checks if you are on the right page 
	public VideoPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/video")) {
			throw new IllegalStateException("This is not video page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void videoSectionIsDisplayed() {
		section_video.isDisplayed();
		
	}
}
