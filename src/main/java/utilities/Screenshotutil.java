package utilities;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
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
		
		String timestamp= new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(0));
		
		File destination= new File("Screenshots"+ filename + "_"+ timestamp +".png");
		
		try {
			FileUtils.copyFile(source, destination);
			System.out.println("File saved-"+destination.getAbsolutePath());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}


	
}
