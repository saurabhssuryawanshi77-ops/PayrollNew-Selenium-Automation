package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigation {

	WebDriver driver;
	
	//------------------Constructor----------------------------//
	
	public Navigation(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//----------------Locators--------------------------------//
	
	    //menu
	    By menu=By.id("menuicon1");
	
	    //menu Employee Leave Application
	    By EmpLeaveApp=By.xpath("//*[@id=\"sidebar1\"]/li[1]/a");
	
	    //menu Employee Maser New
		By EmpMaster=By.xpath("//*[@id=\"sidebar1\"]/li[2]/a");
		
	    //menu Expense Voucher
		By ExpVoucher=By.xpath("//*[@id=\"sidebar1\"]/li[3]/a");
		
		//menu Holidays
		By Holidays=By.xpath("//*[@id=\"sidebar1\"]/li[4]/a");
		
		//menu Leave Status Report
		By Leavestatus=By.xpath("//*[@id=\"sidebar1\"]/li[5]/a");
		
		//menu My Attendance
		By myattendance=By.xpath("//*[@id=\"sidebar1\"]/li[6]/a");
		
		//menu Payslip Reports
		By PayslipReport=By.xpath("//*[@id=\"sidebar1\"]/li[7]/a");
		
		//menu Performance Evaluation
		By PeformanceEval=By.xpath("//*[@id=\"sidebar1\"]/li[8]/a");
				
				
		//menu Policy Acceptance
		By PolicyAcceptance=By.xpath("//*[@id=\"sidebar1\"]/li[9]/a");
				
		//menu Pslip income reports
		By PslipInvstReports=By.xpath("//*[@id=\"sidebar1\"]/li[10]/a");
		
		//menu PT Liability Reports
		By PtLiability=By.xpath("//*[@id=\"sidebar1\"]/li[11]/a");
		
		//menu Tax reports
		By TaxReport=By.xpath("//*[@id=\"sidebar1\"]/li[12]/a");
				
	//signout
	By signout= By.id("ctl00_ctl00_Button1");
	
	//-------------------Methods-----------------------------//
	
	//CLick on menu
	public void clickmenu() {
		driver.findElement(menu).click();
	}
	
	//CLick on Employee Leave Application
		public void emp_leave_application() {
			driver.findElement(EmpLeaveApp).click();
		}
		
	//CLick on Employee Master New
		public void emp_master_new() {
			driver.findElement(EmpMaster).click();
		}
		
	//CLick on Expense Voucher
		public void exp_vocher() {
			driver.findElement(ExpVoucher).click();
		}
		
	//CLick on Holidays
		public void holidays() {
			driver.findElement(Holidays).click();
		}
		
	//CLick on Leave status report
		public void leave_status_rprt() {
			driver.findElement(Leavestatus).click();
		}
		
	//CLick on My Attendance
		public void my_attendance() {
			driver.findElement(myattendance).click();
		}
		
	//CLick on Payslip Reports
		public void payslip_reprt() {
			driver.findElement(PayslipReport).click();
		}
		
	//CLick on Performance Evaluations
		public void performance_eval() {
			driver.findElement(PeformanceEval).click();
		}
		
	//CLick on Policy Acceptance
		public void policy_accept() {
			driver.findElement(PolicyAcceptance).click();
		}
		
	//CLick on Pslip Income Invst Details
		public void incme_inest_details() {
			driver.findElement(PslipInvstReports).click();
		}
		
	//CLick on PT Liability Reports
		public void liability_rprt() {
			driver.findElement(PtLiability).click();
		}
		
	//CLick on Tax Reports
		public void tax_report() {
		    driver.findElement(TaxReport).click();
		}
		
    //click on signout btn
	public void signout() {
		driver.findElement(signout).click();
	}
}
