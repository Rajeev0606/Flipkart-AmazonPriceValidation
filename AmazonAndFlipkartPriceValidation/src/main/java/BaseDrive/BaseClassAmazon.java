package BaseDrive;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import UtilityDrive.UtilClass;

public class BaseClassAmazon extends UtilClass {
	
	@BeforeMethod
	public void StartUp() throws Exception {
		driver = initializeDriver();
		driver.get(prop.getProperty("url2"));
	}
	
	@AfterMethod
	public void CloseUp() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	public void onTestStart(ITestResult result) {
		
	}
	public void onTestSucess(ITestResult result) {
		
	}
	public void onTestFailure(ITestResult result) {
		
	}
	public void onFinish(ITestContext context) {
		
	}

}
