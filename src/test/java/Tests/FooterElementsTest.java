package Tests;

import Base.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FooterElementsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://stanimirovicgradnja.rs/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void webDesignInfoIsDisplayed() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getFooterWebDesignInfo());
        Assert.assertTrue(siteFooterPage.getFooterWebDesignInfo().isDisplayed());
    }

    @Test
    public void copyrightInfoIsDisplayed() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getFooterCopyrightInfo());
        Assert.assertTrue(siteFooterPage.getFooterCopyrightInfo().isDisplayed());
    }

    @Test
    public void poslednjePostavljenaVestAreaIsDisplayed() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getPoslednjePostavljenaVestArea());
        Assert.assertTrue(siteFooterPage.getPoslednjePostavljenaVestArea().isDisplayed());
    }

    @Test
    public void phoneOptionIconIsDisplayed() {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        Actions action = new Actions(driver);
        action.moveToElement(siteFooterPage.getPhoneOptionIcon()).build().perform();
      //  siteFooterPage.getPhoneOptionIcon().click();
        Assert.assertTrue(siteFooterPage.getPhoneOptionIcon().isDisplayed());
    }

    @AfterMethod
    public void removeCookies() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        //    driver.navigate().refresh();
    }

}
