package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	protected WebDriver driver;
	
	//
	//Elements present only on this page
	//
	
	@FindBy(id="form3-username")
	@CacheLookup
	WebElement txt_username;

	@FindBy(id="form3-password")
	@CacheLookup
	WebElement txt_password;

	@FindBy(xpath="//div[1]/button[@class='submit button']")
	@CacheLookup
	WebElement btn_login;

	@FindBy(xpath="//a[@href='/signup']")
	@CacheLookup
	WebElement a_register;
	
	@FindBy(xpath="//a[@href='/password/reset']")
	@CacheLookup
	WebElement a_resetpassword;
	
	@FindBy(xpath="//a[@href='/auth/magic-link']")
	@CacheLookup
	WebElement a_loginbyemail;
	
	@FindBy(xpath="//p[@class='error username-exists none']")
	@CacheLookup
	WebElement badlogin_error;
	
	//Constructor checks if you are on the right page 
	public LoginPage(WebDriver driver) throws InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
		if(!driver.getCurrentUrl().equals("https://lichess.org/login?referrer=/")) {
			throw new IllegalStateException("This is not login page! The current page is " + driver.getCurrentUrl());
		}

	}
	
	//Functions only for this page
	
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
	public void loginerrorformIsDisplayed() {
		badlogin_error.isDisplayed();
	}

}
