package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnalysisPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='analyse__board main-board']")
	@CacheLookup
	WebElement section_analysis;
	
	//Constructor checks if you are on the right page 
	public AnalysisPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!(driver.getCurrentUrl().equals("https://lichess.org/analysis") || driver.getCurrentUrl().equals("https://lichess.org/analysis#explorer"))) {
			throw new IllegalStateException("This is not analysis page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void analysisSectionIsDisplayed() {
		section_analysis.isDisplayed();
		
	}
}
