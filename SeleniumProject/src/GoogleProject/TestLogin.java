package GoogleProject;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


//https://mail.google.com/mail/?ui=html&zy=h

//https://nithinsasalu.wordpress.com/2014/09/19/gmail-compose-mail-using-selenium-webdriver/
public class TestLogin {
  
	WebDriver driver;
	String baseURL;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		baseURL = "https://mail.google.com/mail/?ui=html&zy=h";
		  
		driver = new FirefoxDriver();
		  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void testLogin() throws InterruptedException {
		driver.get(baseURL);
		
		Thread.sleep(4000);
		
		//locate email id field
		WebElement email_element = driver.findElement(By.id("identifierId"));
		email_element.sendKeys("rohantest99@gmail.com");
		
		//locate "Next" button
		WebElement next_element = driver.findElement(By.xpath("//div[@id='identifierNext']//div[@class='ZFr60d CeoRYc']"));
		next_element.click();
		
		
		//locate password element 
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='password']//input[@class='whsOnd zHQkBf']")));
		WebElement password_element = driver.findElement(By.xpath("//div[@id='password']//input[@class='whsOnd zHQkBf']"));
		password_element.sendKeys("venusearth9");
		
		//locate "Next" button
		WebElement next_pwd_element = driver.findElement(By.id("passwordNext"));
		next_pwd_element.click();
		
		Thread.sleep(2000);
		
		String to_address = "rohantest99@gmail.com";
		String msg_contents = " Hi, this is sample email";
		
		
		//locate "Compose" button2
		WebElement compose_element = driver.findElement(By.xpath("//a[@href='?&cs=b&pv=tl&v=b']"));
		compose_element.click();
		
       // locate "To" element 
		WebElement to_element = driver.findElement(By.id("to"));
		to_element.sendKeys(to_address);
		
		
		Thread.sleep(2000);
		
		//locate "subject" element
		WebElement subject_element = driver.findElement(By.xpath("//input[@name = 'subject']"));
		subject_element.sendKeys("Test email");
		
		//locate "body" element
		WebElement body_element = driver.findElement(By.name("body"));
		body_element.sendKeys(msg_contents);
		
		//locate "send" button
		WebElement send_element = driver.findElement(By.name("nvp_bu_send"));
		send_element.click();
		
		
		//check in "sent mail"
		
		//locate "sent mail" link
		WebElement sent_mail_element = driver.findElement(By.xpath("//a[@href='?&s=s']"));
		sent_mail_element.click();
		
		//locate "Refresh" link
		WebElement refresh_element = driver.findElement(By.linkText("Refresh"));
		refresh_element.click();
		
		//select list of emails
		List< WebElement> list_emails =  driver.findElements(By.xpath("//span[@class='ts']"));
		
		//get first email
		WebElement first_email = list_emails.get(0);
		first_email.click();
		
		//check "To" email address
		try{
			WebElement to_chk_element = driver.findElement(By.xpath("//td[contains(text(),'To: " + to_address + "')]"));
			
			
			//check message content
			WebElement msg_element = driver.findElement(By.className("msg"));
			String result = msg_element.getText();
			
			Assert.assertEquals(msg_contents, result);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Failed");
		}
				
		
		
		
		
		
	}
	
	@AfterClass
	public void afterClass() {
		//driver.quit();
	}
  
	
}
