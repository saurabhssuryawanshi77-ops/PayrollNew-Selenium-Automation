package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	WebDriver driver;
	WebDriverWait wait;
	
	public WaitUtility(WebDriver driver) {
		this.driver=driver;
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	//Wait until Visible Condition
	
	public void waitUntilVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//Wait until Element is Clickable
	
	public void waitUntilClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	//wait until Element Disappears
	
	public void waitUntilDisappears(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	//Wait until Page title contains text
	
	public void waitUntilTitleText(String title) {
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	//Implicit Wait
	
	public void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
}
