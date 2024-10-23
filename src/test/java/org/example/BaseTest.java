package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();

        // Define FirefoxOptions to add capabilities
        FirefoxOptions options = new FirefoxOptions();

        // Example: Adding capabilities
        options.addPreference("browser.download.folderList", 2);  // Set custom download folder
        options.addPreference("browser.download.dir", "/path/to/download"); // Set download directory
        options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf"); // Skip save-to-disk prompt for PDFs
        options.setHeadless(true);  // Enable or disable headless mode

        // Initialize FirefoxDriver with options
        driver = new FirefoxDriver(options);

        // Maximize the window
        driver.manage().window().maximize();

        // Example: Navigating to a URL
        driver.get("https://automationteststore.com/");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
