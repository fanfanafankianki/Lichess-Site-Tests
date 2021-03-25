package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	protected WebDriver driver;

	@FindBy(id="form3-username")
	WebElement txt_username;

	@FindBy(id="form3-password")
	WebElement txt_password;

	@FindBy(xpath="//form[1]/div[1]/button")
	WebElement btn_login;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		if(!driver.getCurrentUrl().equals("https://lichess.org/login?referrer=/")) {
			throw new IllegalStateException("This is not login page! The current page is" + driver.getCurrentUrl());
		}

	}

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickLogin() {
		btn_login.click();
	}

	public void loginValidUser(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();
	}
}
