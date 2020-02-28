package Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases  implements IRetryAnalyzer {

	int counter,retries=4;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(counter<retries)
		{
			System.out.println(result.getName()+"  is retrying  "+counter+" "+"th time");
			counter++;
			return true;
		}
		return false;
	}
}