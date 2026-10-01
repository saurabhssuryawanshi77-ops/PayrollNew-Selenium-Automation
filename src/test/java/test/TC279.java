package test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Navigation;
import base.BaseTest;
import pages.ExpenseVoucher;

public class TC279 extends BaseTest{

	@Test (groups="Regression")

	public void tc279() {
		
		//Naviagte to reopen form/refresh form
		Navigation nav= new Navigation(getDriver());
		
		nav.clickmenu();
		nav.exp_vocher();
		
		//click submit and verify error message for mandatory fields
		ExpenseVoucher exp= new ExpenseVoucher(getDriver());
		exp.clickSubmit();
		Assert.assertEquals(exp.project_name_msg(), "Select Project Name");
		Assert.assertEquals(exp.tktNo_msg(), "Enter Ticket No.");
		Assert.assertEquals(exp.startDt_msg(), "Enter Start Date.");
		Assert.assertEquals(exp.endDt_msg(), "Enter End Date.");
	}
}
