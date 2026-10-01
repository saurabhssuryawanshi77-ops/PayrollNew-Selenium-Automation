package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExpenseVoucher {

    WebDriver driver;

    //======================== CONSTRUCTOR ====================================//

    public ExpenseVoucher(WebDriver driver) {

        this.driver = driver;
    }


    //============================Main Form LOCATORS===========================//
    
     // Expense Voucher Form Title
    By exp_form_title= 
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_Label2");
    
    // Customer Dropdown
    By ddlCustomer =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_ddlCustomer1");

    // Supplier Dropdown
    By ddlSupplier =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_ddlSupplier");

    // Project Name Dropdown
    By ddlProjectName =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_ddlProjectName1");

    //===================ADD Ticket No Pop-up Locators============================//
    
    // Add Ticket Number Textbox
    By addTicketNo =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnAddTicketNo");

    //Ticket Number txt
    By txtTicketNumber=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txttickNo");
    
    //Ticket pop-up save btn
    By btnSaveTicketNo=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnticketSave");
    
    //Ticket pop-up cancel btn
    By btnCancelTicketNo=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnTickCancel");
    
    //Ticket pop-up close btn
    By btnCloseTicketNo=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnTickClose");
  
    //===========================Select Dates & Time Locators======================//
    // Start Date
    By clickStartDate =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txt_Start_Dt1");

    // Start Date select date from calender
    By selectStartDate=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_CalendarExtender7_day_1_3");
    
    // Start Time
    By selectStartTime =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txt_Start_Time1");

    // End Date
    By clickEndDate =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txt_End_Dt1");

    By selectEndDate=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txt_End_Dt1");
    
    // End Time
    By selectEndTime =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txt_End_Time1");

    // Time in Days
    By txtTimeInDays =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txt_Life_Days1");

    //=====================Expense GRID LOCATORS=============================//

    // Expense Head Dropdown
    By ddlExpenseHead =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_dgExp1_ctl02_ddl_Expe_Head11");

    // Amount Textbox
    By txtAmount =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_dgExp1_ctl02_txtFAmt1");

    // Tax Amount Textbox
    By txtTaxAmount =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_dgExp1_ctl02_txtTaxxAmount");

    // Remark Textbox
    By txtRemark =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_dgExp1_ctl02_txtFRem1");

    // Approved Status Dropdown
    By ddlApprovedStatus =
            By.id("ddlApprovedStatus");

    // Approved Amount Textbox
    By txtApprovedAmt =
            By.id("txtApprovedAmt");

    // Approved Remark Textbox
    By txtApprovedRemark =
            By.id("txtApprovedRemark");

    // Add Button
    By btnAdd =
            By.id("btnAdd");



    //=========================== BUTTON LOCATORS===============================//

    // Submit Button
    By btnSubmit =
            By.id("btnSubmit");

    // Clear Button
    By btnClear =
            By.id("btnClear");

    // Delete Button
    By btnDelete =
            By.id("btnDelete");

//=================Error Message of mandatory fields Locator=====================//

    //Project Name
    By msgProjectName=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_RequiredFieldValidator7");
    
    //Ticket Number
    By msgTktNo=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_RequiredFieldValidator11");
     
    //Start Date
    By msgStartdt=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_RequiredFieldValidator14");
    
    //End Date
    By msgEnddt=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_RequiredFieldValidator16");
 
   //======================Add New Customer Name Locators====================//
    
    //Add Customer + btn
    By btnAddCustomer=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnAddCust");
    
    //Customer Name
    By txtNewCustomerName=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txtCustName");
    
    //Customer Address
    By txtNewCustomerAddress=
    	By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txtCustAddr");	
    
    //Customer country
    By selectNewCustomerCountry=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_ddlCustCntry");
    
    //Customer state
    By selectNewCustomerState=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_ddlCustState");
   
    //Customer city
    By selectNewCustomerCity=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_ddlCustcity");
    
    //Customer pincode
    By txtNewCustomerPinCode=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txtPinCode");
      
    //Save btn
    By btnSaveNewCustomer=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnCustSave");
    
    //Cancel Btn
    By btnCancelNewCustomer=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnCustCancel");
    
    //Close New Customer pop-up
    By btnCloseNewCustmer=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnCustClose");
     
    //New customer name error message
    By txtNewCustomerNameError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvCustName");
    
    //New Customer Address Error Msg
    By txtNewCustomerAddressError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvCustAddr");
    
    //New Customer select country error msg
    By txtNewCustomerCountryError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvddlCntry");
    
    //New Customer select state error msg
    By txtNewCustomerStateError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvddlState");
    
    //New Customer select city error msg
    By txtNewCustomercityError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvddlcity");
    
    //New Customer enter pincode error msg
    By txtNewCustomerPincodeError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvPinCode");
       
 //======================Add New Supplier Name Locators====================//
    
    //Add Customer + btn
    By btnAddSuplier=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnAddSupp");
    
    //Customer Name
    By txtNewSupplierName=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txtSuppName");
    
    //Customer Address
    By txtSupplierAddress=
    	By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txtSuppAddr");	
    
    //Customer country
    By selectSuppplierCountry=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_ddlSuppCntry");
    
    //Customer state
    By selectSupplierState=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_ddlSuppState");
   
    //Customer city
    By selectSupplierCity=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_ddlSuppCity");
    
    //Customer pincode
    By txtSupplierPinCode=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txtSuppPincode");
      
    //Save btn
    By btnSaveNewSupplier=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnSuppSave");
    
    //Cancel Btn
    By btnCancelNewSupplier=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnSuppCancel");
    
    //Close New Customer pop-up
    By btnCloseNewSupplier=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnSuppClose");
  
  //New customer name error message
    By txtNewSuplierNameError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvCustName");
    
    //New Customer Address Error Msg
    By txtNewSuplierAddressError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvCustAddr");
    
    //New Customer select country error msg
    By txtNewSuplierCountryError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvddlCntry");
    
    //New Customer select state error msg
    By txtNewSuplierStateError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvddlState");
    
    //New Customer select city error msg
    By txtNewSupliercityError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvddlcity");
    
    //New Customer enter pincode error msg
    By txtNewSuplierPincodeError=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_rfvPinCode");
       
    //===================Add New Project========================================//
    
    //Project Name
    By txtNewProjectName=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txtProjectName");
    
    //Customer Name
    By txtNewProjectCode=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txtProjCode");
    
    //Customer Name
    By txtNewProjectDescription=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_txtProjDesc");
      
  //Save btn
    By btnSaveNewProject=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnProjSave");
    
    //Cancel Btn
    By btnCancelNewProject=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnProjCancel");
    
    //Close New Customer pop-up
    By btnCloseNewProject=
    		By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TabContainer1_TbOther_btnProjClose");
     
  //================================METHODS=====================================//

    //Verify Form Title
    public String verify_title() {
    	return driver.findElement(exp_form_title).getText();
    }

    // Select Customer
    public void selectCustomer(String customer) {

        WebElement cust =
                driver.findElement(ddlCustomer);

        Select select =
                new Select(cust);

        select.selectByVisibleText(customer);
    }



    // Select Supplier
    public void selectSupplier(String supplier) {

        WebElement supp =
                driver.findElement(ddlSupplier);

        Select select =
                new Select(supp);

        select.selectByVisibleText(supplier);
    }



    // Select Project Name
    public void selectProjectName(String project) {

        WebElement proj =
                driver.findElement(ddlProjectName);

        Select select =
                new Select(proj);

        select.selectByVisibleText(project);
    }



    // Enter Ticket Number 
    public void enterTicketNumber(String ticketNo) {
        driver.findElement(addTicketNo).click();
        driver.findElement(txtTicketNumber).sendKeys(ticketNo);
        driver.findElement(btnSaveTicketNo).click();
        driver.findElement(btnCloseTicketNo).click();
    }



    // Enter Start Date
    public void enterStartDate() {
 
        driver.findElement(clickStartDate).click();
        driver.findElement(selectStartDate).click();
        
    }

    // Enter Start Time
    public void enterStartTime(String startTime) {

        driver.findElement(selectStartTime)
              .sendKeys(startTime);
    }

    // Enter End Date
    public void enterEndDate() {

        driver.findElement(clickEndDate).click();
        driver.findElement(selectEndDate).click();
    }

    // Enter End Time
    public void enterEndTime(String endTime) {

        driver.findElement(selectEndTime)
              .sendKeys(endTime);
    }
    
    //Enter Time in days
        public void enterDays(String days) {
    	
        	driver.findElement(txtTimeInDays).sendKeys(days);
        	
    }

    // Select Expense Head
    public void selectExpenseHead(String expenseHead) {

        WebElement expense =
                driver.findElement(ddlExpenseHead);

        Select select =
                new Select(expense);

        select.selectByVisibleText(expenseHead);
    }

    // Enter Amount
    public void enterAmount(String amount) {

        driver.findElement(txtAmount)
              .sendKeys(amount);
    }

    // Enter Tax Amount
    public void enterTaxAmount(String taxAmount) {

        driver.findElement(txtTaxAmount)
              .sendKeys(taxAmount);
    }

    // Enter Remark
    public void enterRemark(String ExpenseRemark) {

        driver.findElement(txtRemark)
              .sendKeys(ExpenseRemark);
    }

    // Select Approved Status
    public void selectApprovedStatus(String status) {

        WebElement approved =
                driver.findElement(ddlApprovedStatus);

        Select select =
                new Select(approved);

        select.selectByVisibleText(status);
    }

    // Enter Approved Amount
    public void enterApprovedAmount(String approvedAmount) {

        driver.findElement(txtApprovedAmt)
              .sendKeys(approvedAmount);
    }

    // Enter Approved Remark
    public void enterApprovedRemark(String approvedRemark) {

        driver.findElement(txtApprovedRemark)
              .sendKeys(approvedRemark);
    }

    // Click Add Button
    public void clickAdd() {

        driver.findElement(btnAdd)
              .click();
    }

    // Click Submit Button
    public void clickSubmit() {

        driver.findElement(btnSubmit)
              .click();
    }

    // Click Clear Button
    public void clickClear() {

        driver.findElement(btnClear)
              .click();
    }

    // Click Delete Button
    public void clickDelete() {

        driver.findElement(btnDelete)
              .click();
    }
    
    //Get Error message for project name
         public String project_name_msg() {
    	 return driver.findElement(msgProjectName).getText();
    }
    
    //Error msg Ticket Number
         public String tktNo_msg() {
    	 return driver.findElement(msgTktNo).getText();
    }
        
    //Error msg Start Date
         public String startDt_msg() {
        	 return driver.findElement(msgStartdt).getText();
         }
        
    //Error msg End Date
         public String endDt_msg() {
        	 return driver.findElement(msgEnddt).getText();
         }
         
    //=====================Add Customer Methods===============================//
       
    //click save btn
         public void click_SaveNewCustomer() {
        	 driver.findElement(btnSaveNewCustomer).click();
         }
         
    //Error msg new customer name error
         public String newCustomerNameErrormsg() {
        	 return driver.findElement(txtNewCustomerNameError).getText();
         }
         
    //Error msg New customer Address error
         public String newCustomerAddressErrorMsg() {
        	 return driver.findElement(txtNewCustomerAddressError).getText();
         }
         
    //Error msg New Customer Cuntry error
         public String newCustomerCountryErrorMsg() {
        	 return driver.findElement(txtNewCustomerCountryError).getText();
         }
         
    //Error msg New Customer state error
         public String newCustomerStateErrorMsg() {
        	 return driver.findElement(txtNewCustomerStateError).getText();
         }
         
    //Error msg New Customer City error
         public String newCustomerCityErrorMsg() {
        	 return driver.findElement(txtNewCustomercityError).getText();
         }
         
    //Error msg New Customer PinCode error
         public String newCustomerPincodeErrorMsg() {
        	 return driver.findElement(txtNewCustomerPincodeError).getText();
         }
         
     //Enter New Customer Name
         public void enterNewCustmerName() {
        	 driver.findElement(txtNewCustomerName).sendKeys("NewCustomer_Name");
         }
         
     //Enter New Customer Address
         public void enterNewCustomerAddress() {
        	 driver.findElement(txtNewCustomerAddress).sendKeys("NewCustomer_Address");
         }
}