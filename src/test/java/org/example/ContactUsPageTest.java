package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.ContactUsPage;
import org.example.HomePage;

public class ContactUsPageTest extends BaseTest {
    @Test
    public void verifyContactUsPageTitle() {
        HomePage homePage = new HomePage(driver);
        homePage.clickContactUs();

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        String title = contactUsPage.getContactUsPageTitle();
        Assert.assertEquals(title, "Contact Us - Example Domain");
    }

    @Test
    public void verifyHeadingText() {
        HomePage homePage = new HomePage(driver);
        homePage.clickContactUs();

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        String heading = contactUsPage.getHeadingText();
        Assert.assertEquals(heading, "Contact Us");
    }
}
