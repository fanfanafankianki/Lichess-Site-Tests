package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayerPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main[@class='page-menu']")
	@CacheLookup
	WebElement section_player;
	
	//Constructor checks if you are on the right page 
	public PlayerPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/player")) {
			throw new IllegalStateException("This is not player page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void playerSectionIsDisplayed() {
		section_player.isDisplayed();
		
	}
}
