package WaitTypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.WaitTypes;

public class ExplicitWaitWithUtilityDemo {

	private WebDriver driver;
	private String baseURL;
	private WaitTypes wt;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/pages/practice";
		wt = new WaitTypes(driver);
	
	}

	@Test
	public void test() {
		
		
		driver.get(baseURL);
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		//Explicit waits
		WebElement emailField = wt.waitForElement("user_email", 3);
		emailField.sendKeys("test");
		
		wt.clickWhenReady(By.name("commit"), 3);
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
