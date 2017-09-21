package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {

	WebDriver driver;
	
	public WaitTypes(WebDriver driver){
		
		this.driver = driver;
	}
	
	public WebElement waitForElement(String locator, int timeout) {
		
		WebElement element = null;
		
		try{
			System.out.println("Waiting for element to be loaded");
			
			WebDriverWait wait = new WebDriverWait(driver,timeout);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
			
			System.out.println("Element appeared on web page");
		}
		catch(Exception e){
			System.out.println("Element not appeared on web page");
		}
		
		return element;
	}
	
	public void clickWhenReady(By locator, int timeout) {
		
		
		
		try{
			System.out.println("Waiting for element to be loaded");
			
			WebDriverWait wait = new WebDriverWait(driver,timeout);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("Element clicked on web page");
		}
		catch(Exception e){
			System.out.println("Element not appeared on web page");
		}
		
	}
	
	
}
