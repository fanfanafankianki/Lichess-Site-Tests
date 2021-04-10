package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditorPage;
import pages.HomePage;

public class Tools_BoardEditor {
	WebDriver driver;
	HomePage home;
	EditorPage editor;
	private Utility utility;

	public Tools_BoardEditor(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@When("user hovers over Tools and clicks on Board editor")
	public void user_hovers_over_tools_and_clicks_on_board_editor() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Tools_BoardEditor();
	}

	@Then("user is navigated to the Editor page")
	public void user_is_navigated_to_the_editor_page() throws InterruptedException {
		editor = utility.getEditorPage();
	}

	@And("Editor form is displayed")
	public void editor_form_is_displayed() {
		editor.editorSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
