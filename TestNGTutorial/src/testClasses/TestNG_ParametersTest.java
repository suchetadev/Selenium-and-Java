package testClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class TestNG_ParametersTest {
	
	@BeforeClass
	@Parameters({"browser", "platform"})
	public void beforeClass(String browser, String platform) {
	  
		System.out.println("TestNG_ParametersTest -> BeforeClass");
		System.out.println("1. Parameter from xml file : " + browser);
		System.out.println("2. Parameter from xml file : " + platform);
	}
	
	@Test
	@Parameters({"response"})
	public void testMethod1(String response) {
	
		String[] stringArray = response.split(",");
		
		System.out.println("TestNG_ParametersTest -> testMethod1");
		System.out.println("1. Parameter from xml file : " + response);
		
		System.out.println("2. Parameter from xml file (array) : " + stringArray[0]);
		System.out.println("3. Parameter from xml file (array) : " + stringArray[1]);
		
	}
 

}
