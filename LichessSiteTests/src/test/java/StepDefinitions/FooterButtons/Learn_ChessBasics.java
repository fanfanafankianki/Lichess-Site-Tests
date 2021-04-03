package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.LearnPage;
import pages.HomePage;

public class Learn_ChessBasics {
	WebDriver driver;
	HomePage home;
	ArenaPage arena;
	LearnPage chessbasics;
	private DriverInstance DriverInstance;

	public Learn_ChessBasics(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
		driver = DriverInstance.getDriver();
	}
	
	@When("user hovers over Learn and clicks on Chess basics")
	public void user_hovers_over_learn_and_clicks_on_chess_basics() throws InterruptedException {
		home = new HomePage(driver);
		home.hover_Learn_ChessBasics();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Chess basics page")
	public void user_is_navigated_to_the_chess_basics_page() throws InterruptedException {
		chessbasics = new LearnPage(driver);
	}

	@And("learn chess form is displayed")
	public void learn_chess_form_is_displayed() {
		chessbasics.learnchessformIsDisplayed();
		DriverInstance.teardown(driver);
	}

}
