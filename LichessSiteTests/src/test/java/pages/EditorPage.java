package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditorPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(id="board-editor")
	@CacheLookup
	WebElement section_editor;
	
	//Constructor checks if you are on the right page 
	public EditorPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/editor")) {
			throw new IllegalStateException("This is not editor page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void editorSectionIsDisplayed() {
		section_editor.isDisplayed();
		
	}
}
