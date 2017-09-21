package listenerspackage;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;


public class CustomListener2 implements ITestListener{

	public void onTestStart(ITestResult result) {
		//when test method starts
		System.out.println("onTestStart -> TestName : " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// if test method is successful
		System.out.println("onTestSuccess -> TestName : " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		// if test method is failed
		System.out.println("onTestFailure -> TestName : " + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// if test method is skipped
		System.out.println("onTestSkipped -> TestName : " + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// start before "test" tag of xml file
		System.out.println("onStart -> Test tag Name : " + context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		System.out.println("These methods will be executed in this test tag :");
		for(ITestNGMethod method : methods) {
			System.out.println(method.getMethodName());
		}
	}

	public void onFinish(ITestContext context) {
		// start after "test" tag of xml file
		System.out.println("onFinish -> Test tag Name : " + context.getName());
	}


}
