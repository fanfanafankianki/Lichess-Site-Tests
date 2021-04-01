package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditorPage;
import pages.HomePage;

public class Tools_BoardEditor {
	WebDriver driver;
	HomePage home;
	EditorPage editor;
	private DriverInstance DriverInstance;

	public Tools_BoardEditor(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}
	
	@When("user hovers over Tools and clicks on Board editor")
	public void user_hovers_over_tools_and_clicks_on_board_editor() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Tools_BoardEditor();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Editor page")
	public void user_is_navigated_to_the_editor_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		editor = new EditorPage(driver);
	}

	@And("Editor form is displayed")
	public void editor_form_is_displayed() {
		driver = DriverInstance.getDriver();
		editor.editorSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
