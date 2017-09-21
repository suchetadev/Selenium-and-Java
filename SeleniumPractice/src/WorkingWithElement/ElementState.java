package WorkingWithElement;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementState {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://www.google.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Test
	public void test() {
		
		driver.get(baseURL);
		WebElement e1 = driver.findElement(By.id("gs_htif0"));
		System.out.println("e1 enabled ?" + e1.isEnabled());
		e1.sendKeys("lets kode it");

	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
