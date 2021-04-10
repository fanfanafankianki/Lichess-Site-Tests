package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PuzzleStormPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='puz-board main-board']/div/cg-helper/cg-container/cg-board")
	@CacheLookup
	WebElement puzzlestormgameboard;

	//Constructor checks if you are on the right page 
	public PuzzleStormPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/storm")) {
			throw new IllegalStateException("This is not puzzle storm page! The current page is " + driver.getCurrentUrl());
		}
	}

	public void puzzlestormgameboardIsDisplayed() {
		puzzlestormgameboard.isDisplayed();
	}
}
