package basicweb;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver;
		String baseURL = "http://www.google.com";
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.LINUX);
		
		driver = new FirefoxDriver(caps);
		driver.get(baseURL);
		

	}

}
