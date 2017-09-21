package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_ExerciseSec23 {
	

	WebDriver driver;
	String baseURL;
	
	@BeforeClass
	@Parameters({"driverName", "driverLocation", "driverType"})
	public void beforeClass(String driverName, String driverLocation, String driverType) {
	
		System.setProperty(driverName, driverLocation);
		
		if(driverType.equals("FireFoxDriver")) {
			driver = new FirefoxDriver();			
		}
		else if (driverType.equals("ChromeDriver")) {
			driver = new ChromeDriver();
		}
		
		baseURL = "https://letskodeit.teachable.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testMethod() {
		
		driver.get(baseURL);
		
		//locate "Login" element
		WebElement login_element = driver.findElement(By.xpath("//a[@href='/sign_in']"));
		login_element.click();
		
		//locate Email address
		WebElement email_element = driver.findElement(By.id("user_email"));
		email_element.sendKeys("abc@gmail.com");
		
		//locate password 
		WebElement password_element = driver.findElement(By.id("user_password"));
		password_element.sendKeys("123");
		
		//locate login button
		WebElement login_btn_element = driver.findElement(By.xpath("//form[@id='new_user']//input[@name = 'commit']"));
		login_btn_element.click();
		
		
	}
  
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
