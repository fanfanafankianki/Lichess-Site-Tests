package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.StudyPage;

public class Learn_Study {
	WebDriver driver;
	HomePage home;
	StudyPage study;
	private Utility utility;

	public Learn_Study(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}

	@When("user hovers over Learn and clicks on Study")
	public void user_hovers_over_learn_and_clicks_on_study() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Learn_Study();
	}

	@Then("user is navigated to the Study page")
	public void user_is_navigated_to_the_study_page() throws InterruptedException {
		study = utility.getStudyPage();
	}

	@And("study form is displayed")
	public void study_form_is_displayed() {
		study.studyformIsDisplayed();
		utility.driverTeardown(driver);
	}


}
