package testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import appCode.SomeClassToTest;

public class testNG_DependentTests {
	
	SomeClassToTest obj;
	@BeforeClass
	public void beforeClass() {	
		obj = new SomeClassToTest();
		System.out.println("\n before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\n after class");
	}

	@Test(dependsOnMethods = {"testMethod2"}, alwaysRun = true)
	public void testMethod1() {
		System.out.println("\n test method1");
	}
	
	@Test
	public void testMethod2() {
		int result = obj.sumNumbers(1, 2);
		Assert.assertEquals(result, 2);
		System.out.println("\n test method2");
	}
	
	@Test(dependsOnMethods = {"testMethod1"})
	public void testMethod3() {
		System.out.println("\n test method3");
		
	}
	
	@Test
	public void testMethod4() {
		System.out.println("\n test method4");
		
	}
	
}
