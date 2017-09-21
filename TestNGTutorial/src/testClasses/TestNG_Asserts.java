package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import appCode.SomeClassToTest;

public class TestNG_Asserts {

	@Test
	  public void testSum() {
		
		 System.out.println("Running test --> testSum");
		 SomeClassToTest obj = new SomeClassToTest();
		 int result = obj.sumNumbers(2, 5);
		 Assert.assertEquals(result, 7);
	  }
	
	@Test
	  public void testStrings() {
		
		 System.out.println("Running test --> testStrings");
		 String expectedString = "Hello Sucheta";
		 SomeClassToTest obj = new SomeClassToTest();
		 
		 String result = obj.addStrings("Hello", "Sucheta");
		 Assert.assertEquals(result, expectedString);
		 
	  }
	
	@Test
	  public void testArrays() {
		
		 System.out.println("Running test --> testArrays");
		 int[] expectedArray = {1, 2, 3, 4};
		 SomeClassToTest obj = new SomeClassToTest();
		 
		 int[] result = obj.getArray();
		 Assert.assertEquals(result,expectedArray);
		 
		 System.out.println("Ending test --> testArrays");
		 
	  }
}
