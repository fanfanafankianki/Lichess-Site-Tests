package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.VideoPage;

public class Watch_Video {
	WebDriver driver;
	HomePage home;
	VideoPage video;
	private DriverInstance DriverInstance;

	public Watch_Video(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}

	@When("user hovers over Watch and clicks on Video")
	public void user_hovers_over_watch_and_clicks_on_video() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Watch_Video();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Video page")
	public void user_is_navigated_to_the_video_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		video = new VideoPage(driver);
	}

	@And("Video form is displayed")
	public void video_form_is_displayed() {
		driver = DriverInstance.getDriver();
		video.videoSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
