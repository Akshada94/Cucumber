package Maven.Maven_practice;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestingExtentReports {

	
	@Test
	void test()
	{
		ExtentHtmlReporter html = new ExtentHtmlReporter("Extent.html");
		//ExtentXReporter extentx = new ExtentXReporter(localhost);
	}
}
/*
ExtentHtmlReporter html = new ExtentHtmlReporter("Extent.html");
ExtentXReporter extentx = new ExtentXReporter("localhost");

ExtentReports extent = new ExtentReports();
extent.attachReporter(html, extentx);

extent.createTest("TestName").pass("Test Passed");

extent.flush();

*/