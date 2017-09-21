package usefulMethods;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextDemo {


	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Test
	public void test() {
		
		driver.get(baseURL);
		
		WebElement element = driver.findElement(By.id("opentab"));
		
		String text = element.getText();
		
		System.out.println("Element text is :" + text);
	
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
