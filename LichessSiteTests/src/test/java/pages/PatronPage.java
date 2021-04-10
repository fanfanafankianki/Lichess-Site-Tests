package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatronPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main/aside[@class='page-menu__menu recent-patrons']")
	@CacheLookup
	WebElement form_patrons;
	
	//Constructor checks if you are on the right page 
	public PatronPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/patron")) {
			throw new IllegalStateException("This is not Patron page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void patronsformIsDisplayed() {
		form_patrons.isDisplayed();
		
	}
}
