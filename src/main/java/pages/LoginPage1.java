package pages;
import org.apache.logging.log4j.status.StatusLogger.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;
import utilities.WaitUtility;
import org.openqa.selenium.WebElement;


public class LoginPage1 {

	WebDriver driver;
	WaitUtility waitutil;
	
	public LoginPage1(WebDriver driver) {
		this.driver = driver;
		this.waitutil=new WaitUtility(driver);
	}
	
	By txtloginid = By.id("ctl00_txtuserid");
	 
	By btnnext = By.id("ctl00_lnkNext");

	public void Enterloginid (String loginid) {
		
		WebElement login_txt=driver.findElement(txtloginid);
		
		waitutil.waitUntilVisible(login_txt);
				
				login_txt.sendKeys(ConfigReader.getProperty(loginid));	
				
		
		 
	
	}

	public void clicknext() {
		WebElement btn_nex=driver.findElement(btnnext);
		waitutil.waitUntilClickable(btn_nex);
		btn_nex.click();
		
	}
}