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

public class DropdownSelect {

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
		WebElement element = driver.findElement(By.id("carselect"));
		
		Select sel =new Select(element);
		sel.selectByIndex(0);
		
		Thread.sleep(3000);
		sel.selectByValue("benz");
		
		Thread.sleep(3000);
		sel.selectByVisibleText("Honda");
		
		List<WebElement> list = sel.getOptions();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		
	}
	

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}


}
