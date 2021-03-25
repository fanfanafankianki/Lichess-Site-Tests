package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	protected WebDriver driver;
	By txt_username = By.id("form3-username");
	By txt_password = By.id("form3-password");
	By btn_login = By.xpath("//form[1]/div[1]/button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		if(!driver.getCurrentUrl().equals("https://lichess.org/login?referrer=/")) {
			throw new IllegalStateException("This is not login page! The current page is" + driver.getCurrentUrl());
		}
		
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void loginValidUser(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
}
