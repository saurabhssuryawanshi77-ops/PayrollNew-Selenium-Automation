package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import utilities.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	@BeforeSuite
	@Parameters("browser")
	
	public void setup(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		}
		else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		}
		else {
			throw new  IllegalArgumentException("Invalid browser selected-" + browser);
		}	
		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().get(ConfigReader.getProperty("url"));
		
	}
	
	@AfterSuite
	 public void close() {
		if(getDriver() != null) {
		getDriver().quit();
		driver.remove();
		
		}
	}
}
