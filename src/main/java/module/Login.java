package module;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.LoginPage1;
import pages.LoginPage2;

public class Login {
	 
	WebDriver driver;
	
	 Logger log= LogManager.getLogger(Login.class);
	 public Login(WebDriver driver) {
		
		this.driver = driver;
	}
		public void loginmodule() throws Exception {
			
		LoginPage1 login1=new LoginPage1(driver);
		LoginPage2 login2=new LoginPage2(driver);
		
		//login page1
		login1.Enterloginid("uid");
		login1.clicknext();
		log.info("1st Login page ok");
		
		//Login page2
		login2.enterPassword("password");
		login2.clickLogin();
		log.info("2nd login age ok");
	}
	
	
}
