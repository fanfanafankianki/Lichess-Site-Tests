package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChessBasicsPage extends BasePage {
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='learn__side-home']")
	@CacheLookup
	WebElement learnchessform;

	
	
	//Constructor checks if you are on the right page 
	public ChessBasicsPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/learn#/")) {
			throw new IllegalStateException("This is not chess basics page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void learnchessformIsDisplayed() {
		learnchessform.isDisplayed();
	}
}
