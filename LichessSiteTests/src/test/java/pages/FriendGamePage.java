package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FriendGamePage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main[@class='page-small challenge-page box box-pad challenge--created']")
	@CacheLookup
	WebElement friendinviteform;

	public FriendGamePage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(driver.getCurrentUrl().equals("https://lichess.org/")) {
			throw new IllegalStateException("This is not game page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void friendinviteformIsDisplayed() {
		friendinviteform.isDisplayed();
		
	}
}
