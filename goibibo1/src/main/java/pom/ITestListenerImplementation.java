package pom;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerImplementation implements ITestListener{

	@Override  
	public void onTestStart(ITestResult result) {  

	}  

	@Override  
	public void onTestSuccess(ITestResult result) {   
		System.out.println("Hii");  
	}  

	@Override  
	public void onTestFailure(ITestResult result) {   
		System.out.println("bye");  
	}  

	@Override  
	public void onTestSkipped(ITestResult result) {   
		System.out.println("come");  
	}  

	@Override  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) { 
		System.out.println("Goo");  
	}  

	@Override  
	public void onStart(ITestContext context) {  

	}  

	@Override  
	public void onFinish(ITestContext context) {  

	}  
}
