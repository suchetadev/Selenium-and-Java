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

public class WorkingWithElementList {


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
		List<WebElement> radioBtnList = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		
		for(int i = 0; i < radioBtnList.size(); i++){
			
			if(!radioBtnList.get(i).isSelected()) {
				radioBtnList.get(i).click();
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

}
