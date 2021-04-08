package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChessBasicsPage;
import pages.HomePage;

public class Learn_ChessBasics {
	WebDriver driver;
	HomePage home;
	ChessBasicsPage chessbasics;
	private Utility utility;

	public Learn_ChessBasics(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@When("user hovers over Learn and clicks on Chess basics")
	public void user_hovers_over_learn_and_clicks_on_chess_basics() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Learn_ChessBasics();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Chess basics page")
	public void user_is_navigated_to_the_chess_basics_page() throws InterruptedException {
		chessbasics = utility.getChessBasicsPage();
	}

	@And("learn chess form is displayed")
	public void learn_chess_form_is_displayed() {
		chessbasics.learnchessformIsDisplayed();
		utility.driverTeardown(driver);
	}

}
