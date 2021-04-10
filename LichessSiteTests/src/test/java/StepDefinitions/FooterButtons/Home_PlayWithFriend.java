package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FriendGamePage;
import pages.HomePage;

public class Home_PlayWithFriend {
	WebDriver driver;
	HomePage home;
	FriendGamePage friendgame;
	private Utility utility;

	public Home_PlayWithFriend(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	

	@When("user clicks Play with friend button")
	public void user_clicks_play_with_friend_button() throws InterruptedException {
		home = utility.getHomePage();
		home.clickPlay_with_Friend();
		Thread.sleep(3000);
	}
	
	@And("user choose black pieces in play with friend form")
	public void user_choose_black_pieces_in_play_with_friend_form() throws InterruptedException {
		home.playwithfriend_chooseblack();
	}
	
	@Then("friend game page is opened")
	public void friend_game_page_is_opened() throws InterruptedException {
		friendgame = utility.getFriendGamePage();
	}

	@And("friend game invite form is displayed")
	public void friend_game_invite_form_is_displayed() {
		friendgame.friendinviteformIsDisplayed();
		utility.driverTeardown(driver);
	}
}
