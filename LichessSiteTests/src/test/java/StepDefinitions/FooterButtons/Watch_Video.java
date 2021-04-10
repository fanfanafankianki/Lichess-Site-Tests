package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.VideoPage;

public class Watch_Video {
	WebDriver driver;
	HomePage home;
	VideoPage video;
	private Utility utility;

	public Watch_Video(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}

	@When("user hovers over Watch and clicks on Video")
	public void user_hovers_over_watch_and_clicks_on_video() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Watch_Video();
	}

	@Then("user is navigated to the Video page")
	public void user_is_navigated_to_the_video_page() throws InterruptedException {
		video = utility.getVideoPage();
	}

	@And("Video form is displayed")
	public void video_form_is_displayed() {
		video.videoSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
