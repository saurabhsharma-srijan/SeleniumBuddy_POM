package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void verifyHomePageTitle() {
        HomePage homePage = new HomePage(driver);
        String title = homePage.getHomePageTitle();
        System.out.println(title);
        Assert.assertEquals(title, "End-to-End Supply Chain Orchestration with a Single Integration | TraceLink");
    }

    @Test
    public void navigateToContactUsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickContactUs();
    }

}
