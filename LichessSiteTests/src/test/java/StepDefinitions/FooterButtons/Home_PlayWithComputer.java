package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.When;
import pages.ForumPage;
import pages.HomePage;

public class Home_PlayWithComputer {
	WebDriver driver;
	HomePage home;
	ForumPage forum;
	private Utility utility;

	public Home_PlayWithComputer(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	

	@When("user clicks Play with computer button")
	public void user_clicks_play_with_computer_button() throws InterruptedException {
		home = utility.getHomePage();
		home.clickPlay_with_Computer();
	}
	
	@When("user choose black pieces in play with computer form")
	public void user_choose_black_pieces_in_play_with_computer_form() throws InterruptedException {
		home.playwithcomp_chooseblack();
	}
}
