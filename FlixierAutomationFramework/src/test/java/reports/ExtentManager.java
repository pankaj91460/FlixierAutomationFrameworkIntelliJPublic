package reports;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentManager {
    private static ExtentReports extent;
    public static ExtentReports getInstance() {
        if (extent == null) {
            String timestamp = new SimpleDateFormat("dd-MM-yyyy_HHmmss").format(new Date());
            ExtentSparkReporter spark = new ExtentSparkReporter("./target/TestReports/ExtentReport_" + timestamp + ".html");
            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }
}

