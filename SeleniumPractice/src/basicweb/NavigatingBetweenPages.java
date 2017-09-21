package basicweb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingBetweenPages {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sucheta/java/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		
		String title = driver.getTitle();
		
		System.out.println("Title is :" + title);
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println("Current url is :" +currentURL);
		
		String URLToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		
		driver.navigate().to(URLToNavigate);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		System.out.println("Got refreshed....");
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

}
