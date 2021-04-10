package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArenaPage extends BasePage {
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main/section[@class='tour-home__schedule box']")
	@CacheLookup
	WebElement section_tournament;
	
	//Constructor checks if you are on the right page 
	public ArenaPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/tournament")) {
			throw new IllegalStateException("This is not arena page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void tournamentSectionIsDisplayed() {
		section_tournament.isDisplayed();
		
	}
}
