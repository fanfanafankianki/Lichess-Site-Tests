package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath="//a[@href='/setup/hook']")
	@CacheLookup
	WebElement a_newgame;
	
	@FindBy(xpath="//a[@href='/setup/friend']")
	@CacheLookup
	WebElement a_playwithfriend;

	@FindBy(xpath="//a[@href='/setup/ai']")
	@CacheLookup
	WebElement a_playwithcomp;
	
	@FindBy(xpath="//div[3]/button[@class='color-submits__button button button-metal black']")
	@CacheLookup
	WebElement a_newgame_chooseblack;

	@FindBy(xpath="//div[4]/button[@class='color-submits__button button button-metal black']")
	@CacheLookup
	WebElement a_playwithfriend_chooseblack;
	
	@FindBy(xpath="//div[5]/button[@class='color-submits__button button button-metal black']")
	@CacheLookup
	WebElement a_playwithcomp_chooseblack;
	
	//Main menu elements
	
	@FindBy(xpath="//div[@class='tabs-horiz']/span[1]")
	@CacheLookup
	WebElement span_quick;
	
	@FindBy(xpath="//div[@class='tabs-horiz']/span[2]")
	@CacheLookup
	WebElement span_lobby;

	@FindBy(xpath="//div[@class='tabs-horiz']/span[3]")
	@CacheLookup
	WebElement span_correspondence;
	
	//Quick 1+0
	
	@FindBy(xpath="//div[@data-id='1+0']")
	@CacheLookup
	WebElement span_quick1and0;
	
	// Left and right board elements
	
	@FindBy(xpath="//a[@href='/tv']/span/cg-helper/cg-container/cg-board")
	@CacheLookup
	WebElement left_board;
	
	@FindBy(xpath="//span[@class='mini-board mini-board--init cg-wrap is2d orientation-white']//cg-board")
	@CacheLookup
	WebElement right_board;
	
	//Donate and Swag Store elements
	
	@FindBy(xpath="//a[@href='/patron']")
	@CacheLookup
	WebElement a_patron;
	
	@FindBy(xpath="//a[@href='https://shop.spreadshirt.com/lichess-org']")
	@CacheLookup
	WebElement a_swagstore;
	
	//Play hover -> Create new game -> Black side
	
	@FindBy(xpath="//div[3]/button[@class='color-submits__button button button-metal black']")
	WebElement hov_play_createnewgame_chooseblack;
	
	//Constructor checks if you are on the right page 
	public HomePage (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		if(!driver.getCurrentUrl().equals("https://lichess.org/")) {
			throw new IllegalStateException("This is not home page! The current page is " + driver.getCurrentUrl());
		}

	}
	
	// Play -> New Game -> Choose black
	public void creategame_chooseblack() throws InterruptedException {
		hov_play_createnewgame_chooseblack.click();
		
		//Waiting for player to continue 
		while (true) {
			String s = driver.getCurrentUrl();
		    if (s.equals("https://lichess.org/")) {
		    	Thread.sleep(1000);
		    } else if(!(s.equals("https://lichess.org/"))){
		        break;
		    }
		}
	}
	
	//Main content functions
	public void clickCreate_a_Game() {
		a_newgame.click();
	}
	
	public void clickPlay_with_Friend() {
		a_playwithfriend.click();
	}
	
	public void clickPlay_with_Computer() {
		a_playwithcomp.click();
	}
	
	//
	
	public void createagame_chooseblack() throws InterruptedException {
		a_newgame_chooseblack.click();
		Thread.sleep(10000);
	}
	
	public void playwithfriend_chooseblack() throws InterruptedException {
		a_playwithfriend_chooseblack.click();
		Thread.sleep(10000);
	}
	
	public void playwithcomp_chooseblack() throws InterruptedException {
		a_playwithcomp_chooseblack.click();
		Thread.sleep(10000);
	}
	
	//Main menu clicks
	
	public void clickMenu_quick() {
		span_quick.click();
	}
	
	public void clickMenu_lobby() {
		span_lobby.click();
	}
	
	public void clickMenu_correspondence() {
		span_correspondence.click();
	}
	
	public void clickMenu_quick1and0() {
		span_quick1and0.click();
	}
	
	//Left side Board and Right side Board clicks
	
	public void clickLeftBoard() {
		left_board.click();
	}
	
	public void clickRightBoard() {
		right_board.click();
	}
	
	//Donate and Swag store clicks
	
	public void clickDonate() {
		a_patron.click();
	}
	
	public void clickSwagStore() {
		a_swagstore.click();
	}
	
	//Donate and Swag store scrolls 
	
	public void scrollintoSwagStore(ChromeDriver driver) throws InterruptedException {
		driver.executeScript("arguments[0].scrollIntoView(true);", a_swagstore);
		Thread.sleep(500); 
	}
	
	public void scrollintoPatron(ChromeDriver driver) throws InterruptedException {
		driver.executeScript("arguments[0].scrollIntoView(true);", a_patron);
		Thread.sleep(500); 
	}
}
