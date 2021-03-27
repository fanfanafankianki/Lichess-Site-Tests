package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	protected WebDriver driver;
	
	//
	//Main content elements
	//
	
	@FindBy(xpath=" //main[1]/div[2]/div[1]/span[1]")
	@CacheLookup
	WebElement menu_quick;
	
	//Elements visible after clicking "quick pairing"
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[1]")
	WebElement menu_quick_1and0;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[2]")
	WebElement menu_quick_2and1;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[3]")
	WebElement menu_quick_3and0;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[4]")
	WebElement menu_quick_3and2;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[5]")
	WebElement menu_quick_5and0;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[6]")
	WebElement menu_quick_5and3;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[7]")
	WebElement menu_quick_10and0;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[8]")
	WebElement menu_quick_10and5;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[9]")
	WebElement menu_quick_15and10;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[10]")
	WebElement menu_quick_30and0;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[11]")
	WebElement menu_quick_30and20;
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/div[12]")
	WebElement menu_quick_custom;
	
	//
	
	@FindBy(xpath=" //main[1]/div[2]/div[1]/span[2]")
	@CacheLookup
	WebElement menu_lobby;
	
	//Element visible after clicking "quick pairing"
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]")
	WebElement menu_lobby_firstmatch;
	
	//
	
	@FindBy(xpath=" //main[1]/div[2]/div[1]/span[3]")
	@CacheLookup
	WebElement menu_correspondence;
	
	//Element visible after clicking "correspondence"
	
	@FindBy(xpath="//main[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]")
	WebElement menu_correspondence_firstmatch;
	
	//
	
	@FindBy(xpath="//a[@href='/setup/hook']")
	@CacheLookup
	WebElement a_newgame;
	
	@FindBy(xpath="//a[@href='/setup/friend']")
	@CacheLookup
	WebElement a_playwithfriend;
	
	@FindBy(xpath="//a[@href='/setup/ai']")
	@CacheLookup
	WebElement a_playwithcomputer;
	
	@FindBy(xpath="//main[1]/div[4]/a[1]/span[2]/cg-helper[1]/cg-container[1]/cg-board[1]")
	WebElement cgboard1;
	
	@FindBy(xpath="//main[1]/a[1]/span[2]/cg-helper[1]/cg-container[1]/cg-board[1]")
	WebElement cgboard2;
	
	@FindBy(xpath="//div[@class='lobby__support']/a[@href='/patron']")
	WebElement a_menu_patron;
	
	@FindBy(xpath="	//a[@href='https://shop.spreadshirt.com/lichess-org']")
	WebElement a_menu_shop;
	
	//
	//Elements present on every page
	//
	
	@FindBy(xpath="//header/div[1]/h1[1]/a[1]")
	@CacheLookup
	WebElement a_lichess;
	
	//
	
	@FindBy(xpath="//span[@class='play']")
	@CacheLookup
	WebElement hov_play;
	
	//Elements visible after hover "play"
	
	@FindBy(xpath="//a[@href='/?any#hook']")
	WebElement hov_play_createnewgame;
	
	
	@FindBy(xpath="	//div[1]/form[1]/div[3]/button[1]")
	WebElement hov_play_createnewgame_chooseblack;

	
	@FindBy(xpath="//section/div/a[@href='/tournament']")
	@CacheLookup
	WebElement hov_play_arenatournaments;
	
	@FindBy(xpath="//a[@href='/swiss']")
	@CacheLookup
	WebElement hov_play_swisstournaments;
	
	@FindBy(xpath="//section/div/a[@href='/simul']")
	@CacheLookup
	WebElement hov_play_simultan;
	
	//
	
	@FindBy(xpath="//section/a[@href='/training']")
	@CacheLookup
	WebElement hov_puzzles;
	
	//Elements visible after hover "puzzles"
	
	@FindBy(xpath="//section/div/a[@href='/training']")
	WebElement hov_puzzles_puzzles;
	
	@FindBy(xpath="//a[@href='/training/dashboard/30']")
	WebElement hov_puzzles_dashboard;
	
	@FindBy(xpath="//a[@href='/storm']")
	WebElement hov_puzzles_storm;
	
	@FindBy(xpath="//a[@href='/racer']")
	WebElement hov_puzzles_racer;
	
	//
	
	@FindBy(xpath="//section/a[@href='/practice']")
	@CacheLookup
	WebElement hov_learn;
	
	//Elements visible after hover "learn"
	
	@FindBy(xpath="//a[@href='/learn']")
	WebElement hov_learn_chessbasics;
	
	@FindBy(xpath="//section/div/a[@href='/practice']")
	WebElement hov_learn_practice;
	
	@FindBy(xpath="//a[@href='/training/coordinate']")
	WebElement hov_learn_coordinates;
	
	@FindBy(xpath="//a[@href='/study']")
	WebElement hov_learn_study;
	
	@FindBy(xpath="//a[@href='/coach']")
	WebElement hov_learn_coaches;
	
	//
	
	@FindBy(xpath="//section/a[@href='/tv']")
	@CacheLookup
	WebElement hov_watch;
	
	//Elements visible after hover "watch"
	
	@FindBy(xpath="//section/div/a[@href='/tv']")
	WebElement hov_watch_lichesstv;
	
	@FindBy(xpath="//section/div/a[@href='/games']")
	WebElement hov_watch_games;
	
	@FindBy(xpath="//section/div/a[@href='/streamer']")
	WebElement hov_watch_streamers;
	
	@FindBy(xpath="//a[@href='/broadcast']")
	WebElement hov_watch_broadcasts;
	
	@FindBy(xpath="//a[@href='/video']")
	WebElement hov_watch_video;
	
	//
	
	@FindBy(xpath="//section/a[@href='/player']")
	@CacheLookup
	WebElement hov_community;
	
	//Elements visible after hover "community"
	
	
	@FindBy(xpath="//section/div/a[@href='/player']")
	WebElement hov_community_players;
	
	@FindBy(xpath="//a[@href='/team']")
	WebElement hov_community_teams;
	
	@FindBy(xpath="//section/div/a[@href='/forum']")
	WebElement hov_community_forum;
	
	//
	
	@FindBy(xpath="//section/a[@href='/analysis']")
	@CacheLookup
	WebElement hov_tools;
	
	//Elements visible after hover "tools"
	
	@FindBy(xpath="//section/div/a[@href='/analysis']")
	WebElement hov_tools_analysisboard;
	
	@FindBy(xpath="//a[@href='/analysis#explorer']")
	WebElement hov_tools_explorer;
	
	@FindBy(xpath="//a[@href='/editor']")
	WebElement hov_tools_boardeditor;
	
	@FindBy(xpath="//a[@href='/paste']")
	WebElement hov_tools_importgame;
	
	@FindBy(xpath="//a[@href='/games/search']")
	WebElement hov_tools_search;
	
	//
	
	@FindBy(xpath="//a[@class='link']")
	@CacheLookup
	WebElement hov_search;

	//Element visible after clicking "search" icon
	
	@FindBy(xpath="//header/div[2]/div[1]/input[1]")
	WebElement hov_search_input;
	
	//
	
	@FindBy(xpath="//a[@class='toggle link anon']")
	@CacheLookup
	WebElement hov_settings;
	
	//Elements visible after hover "settings" icon
	
	@FindBy(xpath="//a[@class='sub'][1]")
	WebElement hov_settings_language;
	
	@FindBy(xpath="//a[@class='sub'][2]")
	WebElement hov_settings_sound;
	
	@FindBy(xpath="//a[@class='sub'][3]")
	WebElement hov_settings_background;
	
	@FindBy(xpath="//a[@class='sub'][4]")
	WebElement hov_settings_boardgeometry;
	
	@FindBy(xpath="//a[@class='sub'][5]")
	WebElement hov_settings_boardtheme;
	
	@FindBy(xpath="//a[@class='sub'][6]")
	WebElement hov_settings_pieceset;
	
	@FindBy(xpath="	//a[@class='status']")
	WebElement hov_settings_lag;
	
	//
	//Element available on every page if user is not logged in
	//
	
	@FindBy(xpath="//a[@href='/login?referrer=/']")
	WebElement a_login;
	
	//
	//Elements available on every page if user is logged
	//
	
	@FindBy(id="challenge-toggle")
	@CacheLookup
	WebElement a_challenges;
	
	//Element visible after clicking "challenges" icon
	
	@FindBy(xpath="//a[@href='/?any#friend']")
	WebElement a_challenges_create;
	
	@FindBy(id="notify-toggle")
	@CacheLookup
	WebElement a_notifications;
	
	@FindBy(id="user_tag")
	@CacheLookup
	WebElement a_usertag;
	
	//Elements visible after clicking "usertag"
	
	@FindBy(xpath="//a[@class='user-link online text is-green']")
	WebElement a_usertag_profile;
	
	@FindBy(xpath="//a[@class='/inbox']")
	WebElement a_usertag_inbox;
	
	@FindBy(xpath="//a[@class='/account/preferences/game-display']")
	WebElement a_usertag_settings;
	
	@FindBy(xpath="//button[@class='text']")
	WebElement a_usertag_logout;
	
	
	//
	//Functions for elements visible on home page 
	//
	
	
	//Constructor checks if you are on the right page 
	public HomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		if(!driver.getCurrentUrl().equals("https://lichess.org/")) {
			throw new IllegalStateException("This is not home page! The current page is" + driver.getCurrentUrl());
		}
	}
	
	public void usernameIsDisplayed() {
		a_usertag.isDisplayed();
	}
	
	//
	//Functions for elements visible on every page 
	//
	
	public void clickLichess() {
		a_lichess.click();
	}

	public void clickPlay() {
		hov_play.click();
	}

	public void clickPuzzles() {
		hov_puzzles.click();
	}

	public void clickLearn() {
		hov_learn.click();
	}
	
	public void clickWatch() {
		hov_watch.click();
	}
	
	public void clickCommunity() {
		hov_community.click();
	}
	
	public void clickTools() {
		hov_tools.click();
	}
	
	public void clickSearch() {
		hov_search.click();
	}
	
	public void clickSettings() {
		hov_settings.click();
	}
	
	// Play -> hovered options click
	
	public void hover_Play_Arena() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_play);
		actions.pause(2000);
		actions.moveToElement(hov_play_arenatournaments);
		actions.click().build().perform();

	}
	
	public void hover_Play_NewGame() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_play);
		actions.pause(2000);
		actions.moveToElement(hov_play_createnewgame);
		actions.click().build().perform();

	}
	
	public void hover_Play_Swiss() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_play);
		actions.pause(2000);
		actions.moveToElement(hov_play_swisstournaments);
		actions.click().build().perform();

	}
	
	public void hover_Play_Simultan() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_play);
		actions.pause(2000);
		actions.moveToElement(hov_play_simultan);
		actions.click().build().perform();

	}
	
	// Puzzles -> hovered options click
	
	public void hover_Puzzles_Puzzles() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_puzzles);
		actions.pause(2000);
		actions.moveToElement(hov_puzzles_puzzles);
		actions.click().build().perform();

	}
	
	public void hover_Puzzles_Dashboard() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_puzzles);
		actions.pause(2000);
		actions.moveToElement(hov_puzzles_dashboard);
		actions.click().build().perform();

	}
	
	public void hover_Puzzles_Racer() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_puzzles);
		actions.pause(2000);
		actions.moveToElement(hov_puzzles_racer);
		actions.click().build().perform();

	}
	
	public void hover_Puzzles_Storm() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_puzzles);
		actions.pause(2000);
		actions.moveToElement(hov_puzzles_storm);
		actions.click().build().perform();

	}
	
	// Play -> hovered options click
	
	public void hover_Learn_ChessBasics() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_learn);
		actions.pause(2000);
		actions.moveToElement(hov_learn_chessbasics);
		actions.click().build().perform();

	}
	
	public void hover_Learn_Practice() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_learn);
		actions.pause(2000);
		actions.moveToElement(hov_learn_practice);
		actions.click().build().perform();

	}
	
	public void hover_Learn_Coordinates() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_learn);
		actions.pause(2000);
		actions.moveToElement(hov_learn_coordinates);
		actions.click().build().perform();

	}
	
	public void hover_Learn_Study() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_learn);
		actions.pause(2000);
		actions.moveToElement(hov_learn_study);
		actions.click().build().perform();

	}
	
	public void hover_Learn_Coaches() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(hov_learn);
		actions.pause(2000);
		actions.moveToElement(hov_learn_coaches);
		actions.click().build().perform();

	}
	
	public void creategame_chooseblack() throws InterruptedException {
		hov_play_createnewgame_chooseblack.click();
		Thread.sleep(10000);
	}

}
