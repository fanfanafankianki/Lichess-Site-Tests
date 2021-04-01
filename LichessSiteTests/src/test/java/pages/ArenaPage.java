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
	
	@FindBy(xpath="//main[1]/section[1]")
	@CacheLookup
	WebElement section_tournament;
	
	
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
