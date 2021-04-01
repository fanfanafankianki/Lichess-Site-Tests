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
	}

	@When("user hovers over Tools and clicks on Import game")
	public void user_hovers_over_tools_and_clicks_on_import_game() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Tools_Import();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Import page")
	public void user_is_navigated_to_the_import_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		importpage = new ImportPage(driver);
	}

	@And("Import form is displayed")
	public void import_form_is_displayed() {
		driver = DriverInstance.getDriver();
		importpage.importSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
