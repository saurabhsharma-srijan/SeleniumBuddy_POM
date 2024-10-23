package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeSuite
    public void setupExtent() {
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }





    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        // Create an instance of ChromeDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");// For opening the browser in headless mode
        options.addArguments("--disable-gpu"); // Optional, for specific configurations
        driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Example: Navigating to a URL
        driver.get("https://automationteststore.com/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void tearDownExtent() {
        extent.flush(); // Make sure to flush to write results to the report
    }
}
