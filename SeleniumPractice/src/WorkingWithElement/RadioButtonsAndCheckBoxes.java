package WorkingWithElement;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsAndCheckBoxes {
	

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
	public void test() {
		
		driver.get(baseURL);
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		
		System.out.println(bmwRadioBtn.isSelected());
		
	}
	
	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

}
