package WorkingWithElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseURL);
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		
		Select sel =new Select(element);
		
		System.out.println("Select orange by value");
		sel.selectByValue("orange");
		Thread.sleep(3000);
		
		System.out.println("De-select orange by value");
		sel.deselectByValue("orange");
		Thread.sleep(3000);
		
		System.out.println("Select peach by index");
		sel.selectByIndex(2);
		Thread.sleep(3000);
		
		System.out.println("Select apple by visible text");
		sel.selectByVisibleText("Apple");
		Thread.sleep(3000);
		
		System.out.println("Print all selected options");
		List<WebElement> list = sel.getAllSelectedOptions();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		
		System.out.println("De-select all options ");
		sel.deselectAll();
		
		
		
	}
	

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}


}
