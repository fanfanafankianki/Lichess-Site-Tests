package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.HomePage;
import pages.StudyPage;

public class Learn_Study {
	WebDriver driver;
	HomePage home;
	ArenaPage arena;
	StudyPage study;
	private DriverInstance DriverInstance;

	public Learn_Study(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}

	@When("user hovers over Learn and clicks on Study")
	public void user_hovers_over_learn_and_clicks_on_study() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Learn_Study();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Study page")
	public void user_is_navigated_to_the_study_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		study = new StudyPage(driver);
	}

	@And("study form is displayed")
	public void study_form_is_displayed() {
		driver = DriverInstance.getDriver();
		study.studyformIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
