package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_BeforeClassAnnotation {

	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("This runs before every test method");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("This runs after every test method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Running testMethod1");
	}
	

	@Test
	public void testMethod2() {
		System.out.println("Running testMethod2");
	}


	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This runs once before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This runs once after class ");
	}
	
}
