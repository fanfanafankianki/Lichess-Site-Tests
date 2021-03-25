package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	@Given("user is on login page")
	public void user_is_on_login_page() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Browser_Drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://lichess.org/login?referrer=/");
	}

	@When("user enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
		login = new LoginPage(driver);
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
	public void user_is_navigated_to_the_home_page() {
		home = new HomePage(driver);
		home.userisonhomepage();
	}

	@And("user username is displayed in right corner")
	public void user_username_is_displayed_in_right_corner() {
		home.usernameIsDisplayed();
		driver.close();
		driver.quit();
	
	}
}
