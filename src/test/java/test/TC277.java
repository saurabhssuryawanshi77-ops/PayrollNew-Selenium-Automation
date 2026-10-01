package test;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.ExpenseVoucher;
import pages.Navigation;
import module.Login;

public class TC277 extends BaseTest{

	@Test (groups="Sanity")
	
	public void tc277() throws Exception {
		
		//Navigation to open Expense Voucher
		Navigation nav = new Navigation(getDriver());
		nav.clickmenu();
		nav.exp_vocher();
		
		//Verify the title of form Expense Voucher
		ExpenseVoucher exp=new ExpenseVoucher(getDriver());
		Assert.assertEquals(exp.verify_title(), "Expense Tracking");
	
	}
}
