package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimultaneousExhibitionsPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='box']")
	@CacheLookup
	WebElement section_simul;
	
	//Constructor checks if you are on the right page 
	public SimultaneousExhibitionsPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/simul")) {
			throw new IllegalStateException("This is not simul page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void simultournamentSectionIsDisplayed() {
		section_simul.isDisplayed();
	}
}
