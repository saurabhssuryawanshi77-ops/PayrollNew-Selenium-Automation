package pages;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

import utilities.ConfigReader;

	public class LoginPage2 {

	    WebDriver driver;

	    // Constructor
	    public LoginPage2(WebDriver driver) {

	        this.driver = driver;
	    }

	    // ================= LOCATORS =================

	    // Password textbox
	    By txtPassword =
	            By.id("ctl00_txtpassword");

	    // Portal dropdown
	    By ddlPortal =
	            By.id("ctl00_ddlnewhomepage");

	    // Captcha textbox
	    By txtCaptcha =
	            By.id("ctl00_txtStopSpam");

	    // Login button
	    By btnLogin =
	            By.id("ctl00_IMGBtnSignIn");

	    // Forgot password link
	    By lnkForgotPassword =
	            By.id("ctl00_lnkforgotpwd");


	    // ================= METHODS =================

	    // Enter password
	    public void enterPassword(String password) {
	    	String password1 = ConfigReader.getProperty("password");
	        driver.findElement(txtPassword)
	              .sendKeys(password1);
	    }


	    // Select portal
	    public void selectPortal(String portalName) {

	        WebElement portalDropdown =
	                driver.findElement(ddlPortal);

	        Select select =
	                new Select(portalDropdown);

	        select.selectByVisibleText(portalName);
	    }


	    // Click login
	    public void clickLogin() throws Exception {
            Thread.sleep(5000);
	        driver.findElement(btnLogin)
	              .click();
	    }


	    // Click forgot password
	    public void clickForgotPassword() {

	        driver.findElement(lnkForgotPassword)
	              .click();
	    }
	}

