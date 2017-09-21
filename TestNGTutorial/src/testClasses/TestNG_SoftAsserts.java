package testClasses;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appCode.SomeClassToTest;

public class TestNG_SoftAsserts {

	@Test
	  public void testSum() {
		
		 System.out.println("Running test --> testSum");
		 SomeClassToTest obj = new SomeClassToTest();
		 int result = obj.sumNumbers(2, 5);
		 
		 SoftAssert sa = new SoftAssert();
		 
		 sa.assertEquals(result, 6);
		 
		 System.out.println("After 1st assert");
		 
		 sa.assertEquals(result, 7);
		 
		 System.out.println("After 2nd assert");
		 
		 System.out.println("Ending test --> textSum");
		 
		 sa.assertAll();
	  }
}
