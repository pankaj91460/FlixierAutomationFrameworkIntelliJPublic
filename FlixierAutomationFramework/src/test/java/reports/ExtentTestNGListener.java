package reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class ExtentTestNGListener implements ITestListener {
    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        ExtentTest extentTest = extent.createTest(testName).assignCategory(result.getTestContext().getSuite().getName()).info("Test started at: " + getCurrentTimestamp());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test passed at: " + getCurrentTimestamp());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, "Test failed at: " + getCurrentTimestamp());
        Throwable throwable = result.getThrowable();
        if (throwable != null) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            throwable.printStackTrace(pw);
            String fullStackTrace = sw.toString();
            test.get().fail("<details><summary><b><font color='red'>Click to see full stack trace</font></b></summary>" + "<pre>" + fullStackTrace + "</pre></details>");
        }
        Object currentClass = result.getInstance();
        WebDriver driver = ((framework.Drivers) currentClass).driver;
        String screenshotPath = captureScreenshot(driver, result.getMethod().getMethodName());
        if (screenshotPath != null) {
            try {
                test.get().fail("Screenshot of failure:", MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotPath).build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test skipped at: " + getCurrentTimestamp());
        test.get().log(Status.SKIP, "Reason: " + result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
        retainRecentFiles("./target/TestReports/", ".html", 5);
    }

    private String getCurrentTimestamp() {
        return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
    }

    private String captureScreenshot(WebDriver driver, String testName) {
        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("dd-MM-yyyy_HHmmss").format(new Date());
            String screenshotDir = "./target/TestReports/screenshots/";
            String screenshotPath = screenshotDir + testName + "_" + timestamp + ".png";
            File destFile = new File(screenshotPath);
            destFile.getParentFile().mkdirs();
            Files.copy(srcFile.toPath(), destFile.toPath());
            retainRecentFiles(screenshotDir, ".png", 5);
            byte[] fileContent = Files.readAllBytes(destFile.toPath());
            return java.util.Base64.getEncoder().encodeToString(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void retainRecentFiles(String directoryPath, String extension, int maxFiles) {
        File dir = new File(directoryPath);
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles((d, name) -> name.toLowerCase().endsWith(extension));
            if (files != null && files.length > maxFiles) {
                Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
                for (int i = maxFiles; i < files.length; i++) {
                    files[i].delete();
                }
            }
        }
    }
}