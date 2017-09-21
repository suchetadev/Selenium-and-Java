package Calendar;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderSelection {

	private WebDriver driver;
	private String baseURL;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://www.expedia.com/";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseURL);
		////div[@id='package-departing-wrapper-hp-package']//div[@class = 'datepicker-cal-month'][position()=1]//button[text()=31]
		
		//click onto Departing box
		driver.findElement(By.id("package-departing-hp-package")).click();
		
		Thread.sleep(3000);
		//now select 31 date from first calendar
		driver.findElement(By.xpath("//div[@id='package-departing-wrapper-hp-package']//div[@class = 'datepicker-cal-month'][position()=1]//button[text()='31']")).click();
		
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

}
