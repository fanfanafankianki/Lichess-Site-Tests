package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TvGamesPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main[@class='page-menu tv-games']")
	@CacheLookup
	WebElement section_tvgames;
	
	//Constructor checks if you are on the right page 
	public TvGamesPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/games")) {
			throw new IllegalStateException("This is not games page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void tvgamesSectionIsDisplayed() {
		section_tvgames.isDisplayed();
		
	}
}
