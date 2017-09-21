package listenerspackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;


public class CustomListener3 implements ISuiteListener{

	public void onStart(ISuite suite) {
		// when <suite> starts
		System.out.println("onStart : before suite starts");
		
	}

	public void onFinish(ISuite suite) {
		// when <suite> ends
		System.out.println("onFinish : after suite starts");
		
	}

	

}
