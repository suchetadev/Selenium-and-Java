package WorkingWithElement;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementDisplayed {

	WebDriver driver;
	String baseURL;
	String baseURL1;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/pages/practice";
		baseURL1 = "http://www.expedia.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testForLetsKodeIt() throws InterruptedException {
		driver.get(baseURL);
		
		WebElement element = driver.findElement(By.id("displayed-text"));
		System.out.println(element.isDisplayed());
		
		Thread.sleep(3000);
		WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
		hideBtn.click();
		System.out.println(element.isDisplayed());
		
		Thread.sleep(3000);
		WebElement ShowBtn = driver.findElement(By.id("show-textbox"));
		ShowBtn.click();
		System.out.println(element.isDisplayed());
		
		

	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
