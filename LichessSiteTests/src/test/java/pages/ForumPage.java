package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForumPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main[@class='forum index box']")
	@CacheLookup
	WebElement section_forum;
	
	//Constructor checks if you are on the right page 
	public ForumPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/forum")) {
			throw new IllegalStateException("This is not forum page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void forumSectionIsDisplayed() {
		section_forum.isDisplayed();
		
	}
}
