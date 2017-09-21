package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameDemo {

	
	public static void main(String[] args) {
		

		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.id("gs_htif0")).sendKeys("letskodeit");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		
		driver.findElement(By.name("btnG")).click();

	}

}
