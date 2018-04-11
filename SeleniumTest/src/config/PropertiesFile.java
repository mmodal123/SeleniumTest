package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSeleniumTest;

public class PropertiesFile {
	static Properties prop = new Properties();

	public static void main(String[] args) throws Exception {
		//readPropertiesFile();
		//writePropertiesFile();
	}
	
	public static void readPropertiesFile() throws IOException{
		
		InputStream input = new FileInputStream("E:\\Sphere\\SeleniumTest\\src\\config\\config.properties");
		prop.load(input);
		System.out.println(prop.getProperty("browser"));
		FirstSeleniumTest.browser=prop.getProperty("browser");
		
		
	}
	
	public static void writePropertiesFile() throws Exception{
		OutputStream output = new FileOutputStream("E:\\Sphere\\SeleniumTest\\src\\config\\config.properties");
		prop.setProperty("result", "pass");
		prop.store(output, null);
		
	}

}
