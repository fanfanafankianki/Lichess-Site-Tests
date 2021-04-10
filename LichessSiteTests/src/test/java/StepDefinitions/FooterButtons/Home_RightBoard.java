package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FriendGamePage;
import pages.HomePage;
import pages.TrainingDailyPage;

public class Home_RightBoard {
	WebDriver driver;
	HomePage home;
	FriendGamePage friendgame;
	TrainingDailyPage training;
	private Utility utility;

	public Home_RightBoard(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@When("user clicks on right gameboard")
	public void user_clicks_on_right_gameboard() throws InterruptedException {
		home = utility.getHomePage();
		home.clickRightBoard();
	}

	@Then("user is navigated to the training daily page")
	public void user_is_navigated_to_the_training_daily_page() throws InterruptedException {
		training = utility.getTrainingDailyPage();
	}
	
	@And("training daily gameboard is displayed")
	public void training_daily_gameboard_is_displayed() {
		training.trainingboardIsDisplayed();
		utility.driverTeardown(driver);
	}
}
