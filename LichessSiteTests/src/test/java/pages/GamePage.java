package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamePage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='round__app__board main-board']/div/cg-helper/cg-container/cg-board")
	@CacheLookup
	WebElement gameboard;

	public GamePage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(driver.getCurrentUrl().equals("https://lichess.org/")) {
			throw new IllegalStateException("This is not game page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void gameboardIsDisplayed() {
		gameboard.isDisplayed();
		
	}
}
