package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import base.BaseTest;
import utilities.Screenshotutil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestListener implements ITestListener {
	
    // Create Log4j Logger
    private static final Logger log =
            LogManager.getLogger(TestListener.class);
	
	@Override
	
	public void onStart(ITestContext context ) {
		System.out.println("Suite Started");
		log.info("Suite Started");
	
	
	}
	
	@Override
	
	public void onFinish(ITestContext context) {
		System.out.println("Suite Finished");
		log.info("Suite Finished");
	}
	
	@Override
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +" Started");
		log.info(result.getName()
		        + "Test Started");
	}
	
	@Override
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Passed");
		log.info(result.getName()
		        + "Test Successfull");
	}
	
	@Override
	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " Failed");
		
		Screenshotutil screenshot=new Screenshotutil(BaseTest.getDriver());
		screenshot.captureScreenshot(result.getName());
		
		log.info(result.getName()
		        + "Test Failed");
	}
	
	@Override
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() +" Skipped");
		
		log.info(result.getName()
		        + "Test Skipped");
	}
	
	

}
