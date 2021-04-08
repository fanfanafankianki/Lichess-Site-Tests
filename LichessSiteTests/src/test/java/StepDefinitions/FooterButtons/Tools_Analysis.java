package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AnalysisPage;
import pages.HomePage;

public class Tools_Analysis {
	WebDriver driver;
	HomePage home;
	AnalysisPage analysis;
	private Utility utility;

	public Tools_Analysis(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@When("user clicks on Tools")
	public void user_clicks_on_tools() throws InterruptedException {
		home = utility.getHomePage();
		home.clickTools();
		Thread.sleep(3000);
	}
	
	@When("user hovers over Tools and clicks on Analysis Board")
	public void user_hovers_over_tools_and_clicks_on_analysis_board() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Tools_Analysis();
		Thread.sleep(3000);
	}
	
	@When("user hovers over Tools and clicks on Opening explorer")
	public void user_hovers_over_tools_and_clicks_on_opening_explorer() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Tools_Explorer();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Analysis page")
	public void user_is_navigated_to_the_analysis_page() throws InterruptedException {
		analysis = utility.getAnalysisPage();
	}

	@And("Analysis form is displayed")
	public void analysis_form_is_displayed() {
		analysis.analysisSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
