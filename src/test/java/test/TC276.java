package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import module.Login;
import base.BaseTest;
import pages.Navigation;

public class TC276 extends BaseTest{
	
	@Test(groups="Smoke")
	
	
	public void tc276() throws Exception {
		
    //Login application
		Login login= new Login(getDriver());
		login.loginmodule();
		
	//Navigate to open Expense Voucher form
		Navigation nav= new Navigation(getDriver());
		nav.clickmenu();
		nav.exp_vocher();
	}

}
