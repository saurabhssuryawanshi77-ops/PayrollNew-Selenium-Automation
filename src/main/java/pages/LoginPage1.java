package pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.status.StatusLogger.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

public class LoginPage1 {

	WebDriver driver;
	
	Logger log= (Logger) LogManager.getLogger(LoginPage1.class);

	public LoginPage1(WebDriver driver) {
		this.driver = driver;
	}
	
	By txtloginid = By.id("ctl00_txtuserid");
	
	By btnnext = By.id("ctl00_lnkNext");

	public void Enterloginid (String loginid) {
		driver.findElement(txtloginid).sendKeys(ConfigReader.getProperty(loginid));	
		log.info("Loin ID Entered");
	}

	public void clicknext() {
		driver.findElement(btnnext).click();
		log.info("Next btn clicked moved to 2nd login page");
	}
}