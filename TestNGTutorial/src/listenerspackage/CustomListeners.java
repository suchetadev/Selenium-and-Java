package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListeners implements IInvokedMethodListener, ITestListener, ISuiteListener{

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// Before every method in TestClass
		System.out.println("Before Invocation : "+ testResult.getTestClass().getName() +
				"->" + method.getTestMethod().getMethodName());
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// After every method in TestClass
		System.out.println("After Invocation : "+ testResult.getTestClass().getName() +
				"->" + method.getTestMethod().getMethodName());
	}
	
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
	
	public void onStart(ISuite suite) {
		// when <suite> starts
		System.out.println("onStart : before suite starts");
		
	}

	public void onFinish(ISuite suite) {
		// when <suite> ends
		System.out.println("onFinish : after suite starts");
		
	}
}
