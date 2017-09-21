package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Test3 {
  
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
		
		//find element "Add to cart" for sony experia
		//WebElement add_to_cart = driver.findElement(By.xpath("//button[@onclick='setLocation('http://live.guru99.com/index.php/checkout/cart/add/uenc/aHR0cDovL2xpdmUuZ3VydTk5LmNvbS9pbmRleC5waHAvbW9iaWxlLmh0bWw,/product/1/form_key/niUnQ8G2JUHxtxJh/')']"));
		WebElement add_to_cart = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button"));
		
		add_to_cart.click();
		
		//find element "Quantity text box"
		WebElement quantity = driver.findElement(By.xpath(".//*[@id='shopping-cart-table']//input[@data-cart-item-id='MOB001']"));
		quantity.sendKeys("1000");
		
		//find element "Update" button
		WebElement update_btn = driver.findElement(By.xpath("//button[@title='Update']"));
		update_btn.click();
		
		
		//find element "error message"
		WebElement error_msg = driver.findElement(By.xpath("//p[@class='item-msg error']"));
		String actual = error_msg.getText();
		
		Assert.assertEquals(actual,"* The maximum quantity allowed for purchase is 500.");
		
		//find element "Empty cart" button
		WebElement empty_cart_btn = driver.findElement(By.id("empty_cart_button"));
		empty_cart_btn.click();
		
		//find element "SHOPPING CART IS EMPTY" message
		WebElement cart_empty_msg = driver.findElement(By.xpath("//div[@class='cart-empty']//p[1]"));
		String msg = cart_empty_msg.getText();
	
		
		System.out.println("Msg is --------->" + msg);
		
		Assert.assertEquals(msg,"You have no items in your shopping cart.");
	
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
