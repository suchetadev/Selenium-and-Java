package base;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestSuite {
  
  @BeforeClass
  public void beforeClassBase() {
	  System.out.println("\n This runs before every test class --> BaseTestSuite");
  }

  @AfterClass
  public void afterClassBase() {
	  System.out.println("\n This runs after every test class --> BaseTestSuite");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("\n This runs before every test tag --> BaseTestSuite\n");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("\n This runs after every test tag--> BaseTestSuite\n");
  }
  
  
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("\n This runs before test suite -->  BaseTestSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("\n This runs after test suite --> BaseTestSuite");
  }
  
  
  
  
  

}
