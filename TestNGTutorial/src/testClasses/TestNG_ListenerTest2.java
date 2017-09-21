package testClasses;

//import listenerspackage.CustomListener2;

import org.junit.Assert;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;

//@Listeners(CustomListener3.class)
public class TestNG_ListenerTest2 {
	
	 @BeforeClass
	  public void beforeClass() {
		 System.out.println("Code in before class");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("Code in after class");
	  }
	  
	  @Test
	  public void testMethod1() {
		  System.out.println("Code in testMethod1");
		  Assert.assertTrue(true);
	  }
	  
	  @Test
	  public void testMethod2() {
		  System.out.println("Code in testMethod2");
		  Assert.assertTrue(false);
	  }
 

}
