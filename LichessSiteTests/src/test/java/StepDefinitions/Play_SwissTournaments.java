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
//public class Play_SwissTournaments {
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
//	@When("user hovers over Play and clicks on Simultaneous exhibitions")
//	public void user_hovers_over_play_and_clicks_on_simultaneous_exhibitions() throws InterruptedException {
//		home = new HomePage(driver);
//		home.hover_Play_Simultan();
//		Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to the simultaneous exhibitions page")
//	public void user_is_navigated_to_the_simultaneous_exhibitions_page() {
//	}
//
//	@And("simultaneous exhibitions is displayed")
//	public void simultaneous_exhibitions_is_displayed() {
//	}
//}
