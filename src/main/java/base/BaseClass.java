package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	protected WebDriver driver;
	protected HomePage homePage;

	@BeforeMethod
	public void setUp() {// first way to set the properties

		// System.setProperty("webdriver.chrome.driver","/Users/saleem/eclipse-workspace/com.samsung.us/driver/chromedriver");

		/*
		 * System.setProperty("webdriver.chroome.driver", System.getProperty("user.dir")
		 * ********* NOT RUNNNING WHY? + "/driver/chromedriver");
		 */
		/* System.setProperty("webdriver.chroome.driver", "./driver/chromedriver"); */
		WebDriverManager.chromedriver().driverVersion("105.0.5195.19").setup();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // fullScreen(); method can also be used
		driver.manage().deleteAllCookies();
		driver.get("https://www.samsung.com/us/"); // we can also use Navigate method to the Web site.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
}
