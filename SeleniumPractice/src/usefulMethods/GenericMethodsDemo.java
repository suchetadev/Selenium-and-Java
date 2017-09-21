package usefulMethods;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethodsDemo {

	private WebDriver driver;
	private String baseURL;
	private GenericMethods genericMethods;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/pages/practice";
		
		genericMethods = new GenericMethods(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		
		driver.get(baseURL);
		
		//get element
		WebElement element = genericMethods.getElement("name", "id");
		element.sendKeys("testing");
		
		//get list of elements
		List<WebElement> elementList = genericMethods.getElementList("checkbox-example", "id");
		
		for(int i = 0; i < elementList.size(); i++) {
			System.out.println(elementList.get(i).getText());
		}
		
		//check if element is present or not on web page
		System.out.println("Element is present ? : " + genericMethods.isElementPresent("//input[@id='name']", "xpath"));
		
		System.out.println("Element is present ? : " + genericMethods.isElementPresent("//input[@id='namenot']", "xpath"));
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
