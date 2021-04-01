package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath=" //main[1]/div[2]/div[1]/span[1]")
	@CacheLookup
	WebElement menu_quick;
	
	//Constructor checks if you are on the right page 
	public HomePage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/")) {
			throw new IllegalStateException("This is not home page! The current page is" + driver.getCurrentUrl());
		}
	}
	


}
