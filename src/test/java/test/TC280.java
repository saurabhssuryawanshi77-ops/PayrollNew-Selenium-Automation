package test;

import org.testng.annotations.Test;
import pages.Navigation;
import base.BaseTest;
import pages.ExpenseVoucher;

public class TC280 extends BaseTest{
	@Test
	
	public void tc280() {
		
		//Navigate to refresh form
		Navigation nav= new Navigation(getDriver());
		nav.clickmenu();
		nav.exp_vocher();
		
		//Expense Voucher form verify clear btn
		ExpenseVoucher exp=new ExpenseVoucher(getDriver());
		
		exp.selectCustomer("customer");
		exp.selectSupplier("supplier");
		exp.selectProjectName("project");
		exp.enterTicketNumber("ticketNo");
		exp.enterStartDate();
		exp.enterEndDate();
		exp.enterDays("days");
		exp.selectExpenseHead("expenseHead");
		exp.enterAmount("amount");
		exp.enterTaxAmount("taxAmount");
		exp.enterRemark("ExpenseRemark");
		exp.clickAdd();
		exp.clickClear();
	}

}
