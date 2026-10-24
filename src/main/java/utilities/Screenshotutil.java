package utilities;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshotutil {
	
	WebDriver driver;
	
	public Screenshotutil(WebDriver driver) {
		this.driver=driver;
	}
	
	public void captureScreenshot(String filename) {
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String timestamp= new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
		File folder= new File("Screenshots");
		
		File destination= new File(folder+ filename + "_"+ timestamp +".png");
		
		try {
			FileUtils.copyFile(source, destination);
			System.out.println("Screenshot saved-"+destination.getAbsolutePath());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}


	
}
