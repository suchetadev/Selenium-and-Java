package usefulMethods;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	
	WebDriver driver;
	
	public GenericMethods(WebDriver driver){
		
		this.driver = driver;
	}

	public WebElement getElement(String locator, String type){
		
		type = type.toLowerCase();
		
		if (type.equals("id")) {
			
			System.out.println("Element found with id :" + type);
			return this.driver.findElement(By.id(locator));
		}
		else if (type.equals("xpath")) {
			
			System.out.println("Element found with xpath :" + type);
			return this.driver.findElement(By.xpath(locator));
		}
		else {
			
			System.out.println("Locator type not supported");
			return null;
		}
		
	}
	
	public List<WebElement> getElementList(String locator, String type){
		
		type = type.toLowerCase();
		List<WebElement> list ;
		
		if (type.equals("id")) {
			
			list =  this.driver.findElements(By.id(locator));
		}
		else if (type.equals("xpath")) {
			
			list = this.driver.findElements(By.xpath(locator));
		}
		else {
			
			System.out.println("Locator type not supported");
			return null;
		}
		if(list.isEmpty()){
			System.out.println("Element not found ");
		}
		else{
			System.out.println("Element found with " + type + " : " + locator);
		}
		
		return list;
	}

	public boolean isElementPresent(String locator, String type) {
		
		List<WebElement> list = getElementList(locator, type);
		
		int size = list.size();
		
		if (size > 0) {
			return true;
		}
		else {
			return false;
		}
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
