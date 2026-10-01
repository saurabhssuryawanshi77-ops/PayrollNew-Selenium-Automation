package utilities;

import java.util.Properties;
import java.io.FileInputStream;

public class ConfigReader {
	
	static Properties prop;
	
	static {
		
		try {
			FileInputStream fis=
					new FileInputStream("src/test/resources/config.properties");
			
			prop=new Properties();
			
			prop.load(fis);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static String getProperty(String key) {
		return prop.getProperty(key);
		
	}

}
