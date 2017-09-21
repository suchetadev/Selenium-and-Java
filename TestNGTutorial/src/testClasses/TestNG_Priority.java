package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Priority {
 
	@BeforeClass
	public void beforeClass() {	
		System.out.println("\n TestNG_Priority --> before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\n TestNG_Priority --> after class");
	}

	@Test(priority=2)
	public void testMethod1() {
		System.out.println("\n TestNG_Priority --> test method1");
	}
	
	@Test(priority=1)
	public void testMethod2() {
		System.out.println("\n TestNG_Priority --> test method2");
	}
	
	@Test(priority=0)
	public void testMethod3() {
		System.out.println("\n TestNG_Priority --> test method3");
	}

  
}
