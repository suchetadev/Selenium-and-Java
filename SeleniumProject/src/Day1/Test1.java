package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test1 {
	
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
		
		//find element "THIS IS DEMO SITE FOR" title
		WebElement title = driver.findElement(By.xpath(".//*[@id='top']//h2"));
		String text = title.getText();
		

		Assert.assertEquals(text, "THIS IS DEMO SITE FOR   ");
		
		//find element "MOBILE" link
		WebElement mobile_link = driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']"));
		
		mobile_link.click();
		
		//find element "MOBILE" title
		WebElement title1 = driver.findElement(By.xpath(".//*[@id='top']//h1"));
		String text1 = title1.getText();
		
		Assert.assertEquals(text1, "MOBILE");
		
		//find dropdown Sort By
		WebElement dropdown = driver.findElement(By.cssSelector("select[title='Sort By']"));
		
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
