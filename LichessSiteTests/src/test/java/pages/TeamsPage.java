package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamsPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//table[@class='slist slist-pad']")
	@CacheLookup
	WebElement section_teams;
	
	//Constructor checks if you are on the right page 
	public TeamsPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/team/all")) {
			throw new IllegalStateException("This is not teams page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void teamsSectionIsDisplayed() {
		section_teams.isDisplayed();
		
	}
}
