package WaitTypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	private WebDriver driver;
	private String baseURL;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/pages/practice";
	
	}

	@Test
	public void test() {
		
		
		driver.get(baseURL);
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		//Explicit waits
		WebDriverWait wait = new WebDriverWait(driver,3);
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		
		emailField.sendKeys("test");
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
