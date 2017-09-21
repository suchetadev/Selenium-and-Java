package testClasses;

import org.testng.annotations.Test;

import appCode.SomeClassToTest;

public class TestAnnotation {
	
	
  @Test
  public void testMethod1() {
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.sumNumbers(2, 5);
	  System.out.println("Running test --> testMethod1");
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running test --> testMethod2");
  }
  
  
}
