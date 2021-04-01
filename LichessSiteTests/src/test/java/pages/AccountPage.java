package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//div[@class='page-menu__content box user-show']")
	@CacheLookup
	WebElement section_account;
	
	//Constructor checks if you are on the right page 
	public AccountPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().contains("https://lichess.org/@/")) {
			throw new IllegalStateException("This is not account page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void accountSectionIsDisplayed() {
		section_account.isDisplayed();
		
	}
}
