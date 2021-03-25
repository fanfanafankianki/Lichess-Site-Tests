package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	protected WebDriver driver;
	By txt_username = By.id("user_tag");
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
		if(!driver.getCurrentUrl().equals("https://lichess.org/")) {
			throw new IllegalStateException("This is not home page! The current page is" + driver.getCurrentUrl());
		}
	}
	public boolean userisonhomepage() {
		return driver.getCurrentUrl().equals("https://lichess.org/");
	}
	public void usernameIsDisplayed() {
		driver.findElement(txt_username).isDisplayed();
	}
}
