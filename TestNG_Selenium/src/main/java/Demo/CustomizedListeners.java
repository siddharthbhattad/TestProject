package Demo;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.IResultListener;
import org.testng.internal.annotations.ITest;

import TestBaseHome.base;

public class CustomizedListeners extends base implements ITestListener {

	public void onTestFailure(ITestResult result) {
		
		try {
			screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
