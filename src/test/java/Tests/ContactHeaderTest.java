package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ContactHeaderTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://stanimirovicgradnja.rs/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void addressAppears() {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        Assert.assertTrue(contactHeaderPage.getAddress().isDisplayed());
    }
/*
    @Test
    public void phone1Appears() {
        String expectedURL = "https://stanimirovicgradnja.rs/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertTrue(contactHeaderPage.getPhone1().isDisplayed());
    }

    @Test
    public void phone2Appears() {
        String expectedURL = "https://stanimirovicgradnja.rs/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertTrue(contactHeaderPage.getPhone2().isDisplayed());
    }
*/

    @Test
    public void phoneNumbersAppear() {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        for(int i = 0; i < contactHeaderPage.getListPhoneNumbers().size(); i++) {
            if(!contactHeaderPage.getListPhoneNumbers().get(i).isDisplayed()) {
                break;
            } else {
                Assert.assertTrue(contactHeaderPage.getListPhoneNumbers().get(i).isDisplayed());
            }
        }
    }

    @Test
    public void phoneNumber1IsCorrect() throws InterruptedException {
        Assert.assertTrue(contactHeaderPage.getListPhoneNumbers().get(0).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(contactHeaderPage.getListPhoneNumbers().get(0).getText(), contactHeaderPage.getPhoneNumber1());
    }

    @Test
    public void phoneNumber2IsCorrect() throws InterruptedException {
        Assert.assertTrue(contactHeaderPage.getListPhoneNumbers().get(1).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(contactHeaderPage.getListPhoneNumbers().get(1).getText(), contactHeaderPage.getPhoneNumber2());
    }

    @Test
    public void openHoursIsCorrect() throws InterruptedException {
        Assert.assertTrue(contactHeaderPage.getOpenHours().isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(contactHeaderPage.getOpenHours(), contactHeaderPage.getOpenHoursText());
    }

    @AfterMethod
    public void removeCookies() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
    //    driver.navigate().refresh();
    }

}
