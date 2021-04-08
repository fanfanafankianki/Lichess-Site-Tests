package StepDefinitions.LoginStepDefinitions;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepsLichess {
	
	WebDriver driver = null;
	LoginPage login;
	HomePage home;
	private Utility utility;
	
	public LoginStepsLichess(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver=utility.getDriver();
		driver.navigate().to("https://lichess.org/login?referrer=/");
	}
	
	@When("user enters unvalid username and password")
	public void user_enters_unvalid_username_and_password() throws InterruptedException {
		login = utility.getLoginPage();
		login.enterUsername("Habiba");
		login.enterPassword("Kebaby123");
		Thread.sleep(2000);
	}

	@When("user enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
		login = utility.getLoginPage();
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(2000);
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		login.clickLogin();
		Thread.sleep(4000);

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		home = utility.getHomePage();
	}
	
	@Then("login error text is displayed")
	public void login_error_text_is_displayed() throws InterruptedException {
		login = utility.getLoginPage();
		login.loginerrorformIsDisplayed();
		utility.driverTeardown(driver);
	}

	@And("user username is displayed in right corner")
	public void user_username_is_displayed_in_right_corner() {
		home.usernameIsDisplayed();
		utility.driverTeardown(driver);
	}
}
