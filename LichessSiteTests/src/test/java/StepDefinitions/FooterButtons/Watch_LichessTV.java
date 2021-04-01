package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TvPage;

public class Watch_LichessTV {
	WebDriver driver;
	HomePage home;
	TvPage tv;
	private DriverInstance DriverInstance;

	public Watch_LichessTV(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}
	
	@When("user clicks on Watch")
	public void user_clicks_on_watch() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.clickWatch();
		Thread.sleep(3000);
	}

	@When("user hovers over Watch and clicks on Lichess TV")
	public void user_hovers_over_watch_and_clicks_on_lichess_tv() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Watch_TV();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the TV page")
	public void user_is_navigated_to_the_tv_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		tv = new TvPage(driver);
	}

	@And("TV form is displayed")
	public void tv_form_is_displayed() {
		driver = DriverInstance.getDriver();
		tv.tvSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
