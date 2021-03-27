package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInstance {
	private WebDriver driver;
	
	@Before //Chromedriver path in system
	public void Before() {
		System.out.println("By�em tu");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Browser_Drivers/chromedriver.exe");
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver=driver;
	}


	//Initialization of chromedriver instance and returning it to other class 
	public WebDriver setUp() {
		
		System.out.println("Initializing driver");
		
		//WebDriverManager keeps chromedriver version up to date
		WebDriverManager.chromedriver().setup();
		
		// initialize the driver
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void teardown(WebDriver driver) {
		driver.close();
		driver.quit();
	}
	
}
