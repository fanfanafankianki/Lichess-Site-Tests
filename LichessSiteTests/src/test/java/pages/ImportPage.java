package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(id="main-wrap")
	@CacheLookup
	WebElement section_import;
	
	//Constructor checks if you are on the right page 
	public ImportPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/paste")) {
			throw new IllegalStateException("This is not import page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void importSectionIsDisplayed() {
		section_import.isDisplayed();
		
	}
}
