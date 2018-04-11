package HtmlUnitDriver;

import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

public class HtmlUnitDriverTest {
	public static void main(String[] args) throws Exception {
		
		HtmlUnitDriver driver = new  HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("http://seleniumhq.org/");
		System.out.println("Title is:  " + driver.getTitle());
		
		WebClient webclient = (WebClient) get(driver, "webClient");
		
		System.out.println(webclient.getBrowserVersion().isChrome());
		
		driver.quit();
		
	}
	
	private static Object get(Object object, String field) throws Exception {
		  Field f = object.getClass().getDeclaredField(field);
		  f.setAccessible(true);
		  return f.get(object);
		 }

}
