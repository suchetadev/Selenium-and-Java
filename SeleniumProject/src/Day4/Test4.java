package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test4 {
  
  WebDriver driver;
  String baseURL;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
	  baseURL = "http://live.guru99.com/index.php/";
	  
	  driver = new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  
  @Test
  public void test() throws InterruptedException {
	  
	  driver.get(baseURL);
	  
	  //find element "MOBILE" link
	  WebElement mobile_link = driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']"));
			
	  mobile_link.click();
	  
	  //mobile list 
	 
	 // WebElement mobile_list = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/p/strong"));
		
	  //mobile_list.click();
	  
	  Thread.sleep(1000);
	 
	  //add to compare samsung galaxy
	  WebElement add_to_compare1 = driver.findElement(By.xpath(".//*[@id='products-list']/li[2]/div/div/div[3]/ul/li[2]/a"));
	  add_to_compare1.click();
	  
	  
	  
	  //add to compare sony xperia
	 // WebElement add_to_compare2 = driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/catalog/product_compare/add/product/1/uenc/aHR0cDovL2xpdmUuZ3VydTk5LmNvbS9pbmRleC5waHAvbW9iaWxlLmh0bWw,/form_key/i2O9ij865eRE5LQf/']"));
	 // add_to_compare2.click();
	  
	  
			
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
}
