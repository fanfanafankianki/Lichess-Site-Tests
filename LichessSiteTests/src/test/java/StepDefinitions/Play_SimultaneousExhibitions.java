//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.ArenaPage;
//import pages.HomePage;
//
//public class Play_SimultaneousExhibitions {
//
//	WebDriver driver = null;
//	HomePage home;
//	ArenaPage arena;
//	
//	@Before
//	public void browserSetup() {
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Browser_Drivers/chromedriver.exe");
//		driver = new ChromeDriver(); 
//		
//		System.out.println("A czemu tu");
//		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//	
//	@After
//	public void teardown() {
//		driver.close();
//		driver.quit();
//	}
//	
//	@When("user hovers over Play and clicks on Swiss tournaments")
//	public void user_hovers_over_play_and_clicks_on_swiss_tournaments() throws InterruptedException {
//		home = new HomePage(driver);
//		home.hover_Play_Swiss();
//		Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to the swiss tournaments page")
//	public void user_is_navigated_to_the_swiss_tournaments_page() {
//	}
//
//	@And("swiss tournament section is displayed")
//	public void swiss_tournament_section_is_displayed() {
//	}
//}
