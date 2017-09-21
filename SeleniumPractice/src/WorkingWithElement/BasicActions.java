package WorkingWithElement;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() {
		
		driver.get(baseURL);
		
		//get XPath for Login button 
		driver.findElement(By.xpath("//div[@id='navbar']//a[@href ='/sign_in']")).click();
		
		//clear the username field
		//driver.findElement(By.xpath("//input[@id='user_email']")).clear();
		
		System.out.println("here us  kjnckd");
		
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("abc@gmail.com");
		
		//send user name to field
		//driver.findElement(By.id("user_email")).sendKeys("abc@gmail.com");
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	

}
