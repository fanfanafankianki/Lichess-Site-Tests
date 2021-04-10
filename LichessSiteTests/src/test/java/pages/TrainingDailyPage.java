package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingDailyPage extends BasePage{
	
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//main[1]/div[1]/div[1]/cg-helper[1]/cg-container[1]/cg-board[1]")
	@CacheLookup
	WebElement training_board;
	
	//Constructor checks if you are on the right page 
	public TrainingDailyPage (WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/training/daily")) {
			throw new IllegalStateException("This is not Training Daily page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void trainingboardIsDisplayed() {
		training_board.isDisplayed();
		
	}
}
