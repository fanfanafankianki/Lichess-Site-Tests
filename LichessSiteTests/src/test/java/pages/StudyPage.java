package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main[@class='page-menu__content study-index box']")
	@CacheLookup
	WebElement study_form;

	//Constructor checks if you are on the right page 
	public StudyPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/study")) {
			throw new IllegalStateException("This is not study page! The current page is " + driver.getCurrentUrl());
		}
	}
	
	public void studyformIsDisplayed() {
		study_form.isDisplayed();
	}
}
