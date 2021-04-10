package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TvPage;

public class Watch_LichessTV {
	WebDriver driver;
	HomePage home;
	TvPage tv;
	private Utility utility;

	public Watch_LichessTV(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	@When("user clicks on Watch")
	public void user_clicks_on_watch() throws InterruptedException {
		home = utility.getHomePage();
		home.clickWatch();
	}

	@When("user hovers over Watch and clicks on Lichess TV")
	public void user_hovers_over_watch_and_clicks_on_lichess_tv() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Watch_TV();
	}

	@Then("user is navigated to the TV page")
	public void user_is_navigated_to_the_tv_page() throws InterruptedException {
		tv = utility.getTvPage();
	}

	@And("TV form is displayed")
	public void tv_form_is_displayed() {
		tv.tvSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
