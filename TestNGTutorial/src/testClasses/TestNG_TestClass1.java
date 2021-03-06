package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_TestClass1 {

	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("This runs before every test method --> TestNG_TestClass1");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("This runs after every test method --> TestNG_TestClass1");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Running testMethod1 --> TestNG_TestClass1");
	}
	

	@Test
	public void testMethod2() {
		System.out.println("Running testMethod2 --> TestNG_TestClass1");
	}


	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This runs once before class --> TestNG_TestClass1");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This runs once after class --> TestNG_TestClass1");
	}
	
}
