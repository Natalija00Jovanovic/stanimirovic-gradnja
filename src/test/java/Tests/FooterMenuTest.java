package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FooterMenuTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://stanimirovicgradnja.rs/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void kontaktMessageIsDisplayed() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getKontaktMessage());
        Assert.assertTrue(siteFooterPage.getKontaktMessage().isDisplayed());
    }

    @Test
    public void kontaktButtonIsClickable() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getKontaktButton());
        Assert.assertTrue(siteFooterPage.getKontaktButton().isDisplayed());
        siteFooterPage.getKontaktButton().click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), kontaktPage.getKontaktPageURL());
    }

    @Test
    public void logoInFooterIsDisplayed() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getLogoInFooter());
        Assert.assertTrue(siteFooterPage.getLogoInFooter().isDisplayed());
    }

    @Test
    public void meniAreaAppears() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getMeniArea());
        Assert.assertTrue(siteFooterPage.getMeniArea().isDisplayed());
    }

    @Test
    public void meniAreaPocetnaElementIsClickable() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getMeniAreaPocetnaElement());
        Assert.assertTrue(siteFooterPage.getMeniAreaPocetnaElement().isDisplayed());
        siteFooterPage.getMeniAreaPocetnaElement().click();
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
    }

    @Test
    public void meniAreaProjektiUIzgradnjiElementIsClickable() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getMeniAreaProjektiUIzgradnjiElement());
        Assert.assertTrue(siteFooterPage.getMeniAreaProjektiUIzgradnjiElement().isDisplayed());
        siteFooterPage.getMeniAreaProjektiUIzgradnjiElement().click();
        Assert.assertEquals(driver.getCurrentUrl(), uIzgradnjiPage.getUIzgradnjiURL());
    }

    @Test
    public void meniAreaIzgradjeniObjektiElementIsClickable() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getMeniAreaIzgradjeniObjektiElement());
        Assert.assertTrue(siteFooterPage.getMeniAreaIzgradjeniObjektiElement().isDisplayed());
        siteFooterPage.getMeniAreaIzgradjeniObjektiElement().click();
        Assert.assertEquals(driver.getCurrentUrl(), izgradjeniObjektiPage.getIzgradjeniObjektiURL());
    }

    @Test
    public void meniAreaONamaElementIsClickable() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getMeniAreaONamaElement());
        Assert.assertTrue(siteFooterPage.getMeniAreaONamaElement().isDisplayed());
        siteFooterPage.getMeniAreaONamaElement().click();
        Assert.assertEquals(driver.getCurrentUrl(), oNamaPage.getONamaURL());
    }

    @Test
    public void meniAreaKontaktElementIsClickable() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        scrollToElement(siteFooterPage.getMeniAreaKontaktElement());
        Assert.assertTrue(siteFooterPage.getMeniAreaKontaktElement().isDisplayed());
        siteFooterPage.getMeniAreaKontaktElement().click();
        Assert.assertEquals(driver.getCurrentUrl(), kontaktPage.getKontaktPageURL());
    }

    @AfterMethod
    public void removeCookies() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        //    driver.navigate().refresh();
    }

}
