package usefulMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethodsOld {
	
	WebDriver driver;
	
	public GenericMethodsOld(WebDriver driver){
		
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
		
		if (type.equals("id")) {
			
			System.out.println("Element found with id :" + type);
			return this.driver.findElements(By.id(locator));
		}
		else if (type.equals("xpath")) {
			
			System.out.println("Element found with xpath :" + type);
			return this.driver.findElements(By.xpath(locator));
		}
		else {
			
			System.out.println("Locator type not supported");
			return null;
		}
		
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

}
