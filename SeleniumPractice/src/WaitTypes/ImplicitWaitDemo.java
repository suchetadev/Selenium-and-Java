package WaitTypes;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitDemo {

	private WebDriver driver;
	private String baseURL;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/pages/practice";
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		
		
		driver.get(baseURL);
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("user_email")).sendKeys("test");
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
