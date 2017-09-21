package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClassName {

	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		
		driver = new FirefoxDriver();
		
		String baseURL = "http://demostore.x-cart.com/";
		
		driver.get(baseURL);
		
		driver.findElement(By.className("title")).click();

	}

}
