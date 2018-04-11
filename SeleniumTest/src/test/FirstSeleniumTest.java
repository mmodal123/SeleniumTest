package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PropertiesFile;

public class FirstSeleniumTest {
	
	public static String browser;
	static WebDriver driver;
	
	
	
	public static void main(String[] args) throws InterruptedException, Exception {
		
		//setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
	}
	
		public static void setBrowser(){
			browser="chrome";
			
		}
		public static void setBrowserConfig(){
			if(browser.contains("chrome")){
			String projectLocation = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();}
		}
		
		public static void runTest() throws InterruptedException{
			
			driver.get("https://www.seleniumhq.org/");
			Thread.sleep(1000);
			driver.quit();
			
		}
		

}
