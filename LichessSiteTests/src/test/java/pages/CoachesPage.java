package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoachesPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='coach-list__main coach-main box']")
	@CacheLookup
	WebElement coach_form;

	//Constructor checks if you are on the right page 
	public CoachesPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/coach")) {
			throw new IllegalStateException("This is not coach page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void coachformIsDisplayed() {
		coach_form.isDisplayed();
	}
}
