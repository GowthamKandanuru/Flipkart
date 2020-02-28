package Utility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public  class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+"---> testcase started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"---> success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getName()+"----> failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"----> skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
