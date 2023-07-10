package day38;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent; //populate common info on the report
	public ExtentTest test; //creating test case entries in the report and upadate status of the test methods
	
	
	public void onStart(ITestContext Context) {
		
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("computername", "localhost");
		extent.setSystemInfo("Envirment", "QA");
		extent.setSystemInfo("Testername", "Johnson");
		extent.setSystemInfo("Os", "windows10");
		extent.setSystemInfo("Browser name", "Chrome,firefox,edge");
		
	}
		
	public void onTestSuccess(ITestResult result) {
		
		test=extent.createTest(result.getName()); //create new entry in the report
		test.log(Status.PASS, "Test case is PASSED is:"+result.getName()); //upadte the p/f/s
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case is failed:"+result.getName());
		test.log(Status.FAIL, "Test case is failed cause is:"+result.getThrowable() );
	}
	
	public void onTestSkipped(ITestResult result) {
		
		test=extent.createTest(result.getName());
		test.log(Status.SKIP,"test case skipped is:"+result.getName());
	}
	
	public void onFinish(ITestContext Context) {
		extent.flush();
	}
				
		
	}


