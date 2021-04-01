package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main[@class='auth auth-signup box box-pad']")
	@CacheLookup
	WebElement registerform;

	//Constructor checks if you are on the right page 
	public SignupPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/signup")) {
			throw new IllegalStateException("This is not sign up page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void registerformIsDisplayed() {
		registerform.isDisplayed();
	}
}
