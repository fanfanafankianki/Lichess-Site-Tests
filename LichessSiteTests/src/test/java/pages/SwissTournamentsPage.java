package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwissTournamentsPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main[@class=\"page-small box box-pad page swiss-home\"]")
	@CacheLookup
	WebElement section_swiss;
	
	//Constructor checks if you are on the right page 
	public SwissTournamentsPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/swiss")) {
			throw new IllegalStateException("This is not Swiss page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void swisstournamentSectionIsDisplayed() {
		section_swiss.isDisplayed();
		
	}
}
