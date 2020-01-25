package App;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class MyListeners implements ITestListener {
    Base b =new Base();
    public void onTestStart(ITestResult iTestResult) {
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Mylistener class method onTestSuccess running");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("in test failure method of listners");
        try {
            b.getScreenshot(iTestResult.getName());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult iTestResult) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    public void onStart(ITestContext iTestContext) {
    }

    public void onFinish(ITestContext iTestContext) {
    }
}
