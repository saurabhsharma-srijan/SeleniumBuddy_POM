package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By contactUsLink = By.xpath("//a[@class='btn btn--primary-dark btn--small']");

    // Methods
    public void clickContactUs() {
        driver.findElement(contactUsLink).click();
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

}
