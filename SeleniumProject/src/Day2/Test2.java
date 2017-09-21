package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
 
	WebDriver driver;
	String baseURL;
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://live.guru99.com/index.php/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() {
		
		driver.get(baseURL);
		
		//find element "MOBILE" link
		WebElement mobile_link = driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']"));
		
		mobile_link.click();
		
		//find element which contains cost of sony xperia
		WebElement cost_experia = driver.findElement(By.xpath("//span[@id = 'product-price-1']"));
		String cost = cost_experia.getText();
		
		
		//find element sony experia image
		WebElement experia_image = driver.findElement(By.id("product-collection-image-1"));
		experia_image.click();
		
		//find rightmost cost element which contains cost of sony experia
		WebElement cost_experia1 = driver.findElement(By.xpath("//span[@id='product-price-1']/span"));
		String cost1 = cost_experia1.getText();
		
		Assert.assertEquals(cost, cost1);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
}
