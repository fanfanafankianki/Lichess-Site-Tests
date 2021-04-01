package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TvPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='cg-wrap orientation-white manipulable']")
	@CacheLookup
	WebElement section_tv;
	
	//Constructor checks if you are on the right page 
	public TvPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/tv")) {
			throw new IllegalStateException("This is not tv page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void tvSectionIsDisplayed() {
		section_tv.isDisplayed();
		
	}
}
