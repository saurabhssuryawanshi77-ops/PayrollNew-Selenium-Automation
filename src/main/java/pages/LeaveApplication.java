
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.ConfigReader;

public class LeaveApplication {

    WebDriver driver;

    // ================= CONSTRUCTOR =================

    public LeaveApplication(WebDriver driver) {

        this.driver = driver;
    }



    // ================= LOCATORS =================

    // Employee dropdown
    By ddlEmployee =
            By.id("ctl00$ctl00$ContentPlaceHolder1$ContentPlaceHolder1$dpdemp");
    
    // Ref no. text
    By txtRefNo =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_LEAVEx_Manual_Ref_No");
    
    // Leave Type dropdown
    By ddlLeaveType =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_ddlLeave_Type");

    // Reason dropdown
    By ddlReason =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_ddlReson_Id");

    // Subject textbox
    By txtSubject =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_TextBox1");

    // Leave Start Date
    By txtStartDate =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtStartdate");

    // Leave End Date
    By txtEndDate =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtEndDate");

    // Description textbox
    By txtDescription =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtdesc");

    // Select Day Type dropdown
    By ddlDayType =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_ddlDayType");

    // Upload File
    By uploadFile =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_FileUpload2");

    // Submit Leave button
    By btnSubmitLeave =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_btnSubmit");

    // Cancel Leave button
    By btnCancelLeave =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_btnLeaveCancel");

    // Resend Email button
    By btnResendEmail =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_btnResend");

    // Clear button
    By btnClear =
            By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_BtnCancel");



    // ================= METHODS =================


    // Select Employee
    public void selectEmployee() {

        WebElement employee =
                driver.findElement(ddlEmployee);

        Select select =
                new Select(employee);

        select.selectByVisibleText(ConfigReader.getProperty("employee_name"));
    }

    // Select Leave Type
    public void selectLeaveType() {
       
        WebElement leave =
                driver.findElement(ddlLeaveType);

        Select select =
                new Select(leave);

        select.selectByVisibleText(ConfigReader.getProperty("leave_type"));
    }

    // Select Reason
    public void selectReason() {

        WebElement reasonDropdown =
                driver.findElement(ddlReason);

        Select select =
                new Select(reasonDropdown);

        select.selectByVisibleText(ConfigReader.getProperty("leave_reason"));
    }

    // Enter Subject
    public void enterSubject() {
      String subject= ConfigReader.getProperty("leave_subject");
        driver.findElement(txtSubject)
              .sendKeys(subject);
    }

    // Enter Start Date
    public void enterStartDate(String startDate) {

        driver.findElement(txtStartDate)
              .sendKeys(startDate);
    }

    // Enter End Date
    public void enterEndDate(String endDate) {

        driver.findElement(txtEndDate)
              .sendKeys(endDate);
    }

    // Enter Description
    public void enterDescription() {
        
    	String description = ConfigReader.getProperty("leave_description");
        driver.findElement(txtDescription)
              .sendKeys(description);
    }

    // Select Day Type
    public void selectDayType() {

        WebElement day =
                driver.findElement(ddlDayType);

        Select select =
                new Select(day);

        select.selectByVisibleText(ConfigReader.getProperty("leave_day_type"));
    }

    // Upload File
    public void uploadDocument(String filePath) {

        driver.findElement(uploadFile)
              .sendKeys(filePath);
    }

    // Click Submit Leave
    public void clickSubmitLeave() {

        driver.findElement(btnSubmitLeave)
              .click();
    }

    // Click Cancel Leave
    public void clickCancelLeave() {

        driver.findElement(btnCancelLeave)
              .click();
    }
    
   // Click Resend Email
    public void clickResendEmail() {

        driver.findElement(btnResendEmail)
              .click();
    }

    // Click Clear
    public void clickClear() {

        driver.findElement(btnClear)
              .click();
    }

}