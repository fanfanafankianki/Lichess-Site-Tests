package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PuzzleRacePage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main[@class='page page-small racer-home box box-pad']")
	@CacheLookup
	WebElement puzzleracegameboard;

	//Constructor checks if you are on the right page 
	public PuzzleRacePage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/racer")) {
			throw new IllegalStateException("This is not puzzle race page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void puzzleracergameboardIsDisplayed() {
		puzzleracegameboard.isDisplayed();
	}
}
