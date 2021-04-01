package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(id="main-wrap")
	@CacheLookup
	WebElement section_search;
	
	//Constructor checks if you are on the right page 
	public SearchPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/games/search")) {
			throw new IllegalStateException("This is not search page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void searchSectionIsDisplayed() {
		section_search.isDisplayed();
		
	}
}
