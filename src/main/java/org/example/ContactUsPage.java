package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ContactUsPage {
    WebDriver driver;

    // Constructor
    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By heading = By.tagName("h1");

    // Methods
    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public String getContactUsPageTitle() {
        return driver.getTitle();
    }
}
