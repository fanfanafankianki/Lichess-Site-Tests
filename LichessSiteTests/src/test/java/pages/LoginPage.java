package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	protected WebDriver driver;
	//
	//
	//Elements present only on this page
	//
	//
	
	@FindBy(id="form3-username")
	WebElement txt_username;

	@FindBy(id="form3-password")
	WebElement txt_password;

	@FindBy(xpath="//form[1]/div[1]/button")
	WebElement btn_login;

	@FindBy(xpath="//a[@href='/signup']")
	WebElement a_register;
	
	@FindBy(xpath="//a[@href='/password/reset']")
	WebElement a_resetpassword;
	
	@FindBy(xpath="//a[@href='/auth/magic-link']")
	WebElement a_loginbyemail;
	
	//
	//
	//Elements present on every page
	//
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
	
	
	
	//Constructor
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		if(!driver.getCurrentUrl().equals("https://lichess.org/login?referrer=/")) {
			throw new IllegalStateException("This is not login page! The current page is" + driver.getCurrentUrl());
		}

	}
	
	//
	//Functions only for this page
	//
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void loginValidUser(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();
	}

	public void clickLogin() {
		btn_login.click();
	}
	
	public void clickRegister() {
		a_register.click();
	}
	
	public void clickResetPassword() {
		a_resetpassword.click();
	}
	
	public void clickLoginByEmail() {
		a_loginbyemail.click();
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

}
