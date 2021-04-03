package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ImportPage;

public class Tools_Import {
	WebDriver driver;
	HomePage home;
	ImportPage importpage;
	private DriverInstance DriverInstance;

	public Tools_Import(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
		driver = DriverInstance.getDriver();
	}

	@When("user hovers over Tools and clicks on Import game")
	public void user_hovers_over_tools_and_clicks_on_import_game() throws InterruptedException {
		home = new HomePage(driver);
		home.hover_Tools_Import();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Import page")
	public void user_is_navigated_to_the_import_page() throws InterruptedException {
		importpage = new ImportPage(driver);
	}

	@And("Import form is displayed")
	public void import_form_is_displayed() {
		importpage.importSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
