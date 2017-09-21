/*package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver;
		String baseURL = "http://www.google.com";
		
		System.setProperty("webdriver.chrome.driver","/home/sucheta/java/workspace/chromedriver");
		
		driver = new ChromeDriver();
		driver.get(baseURL);
	}

}*/
package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		//driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		//driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();
	}

}
