package Tests;

import Base.BaseTest;
import Pages.UIzgradnjiPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ClickableHeaderTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://stanimirovicgradnja.rs/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void clickableLogoAppears() {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        Assert.assertTrue(clickableHeaderPage.getClickableLogo().isDisplayed());
    }

    @Test
    public void clickableLogoIsClickable() {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        clickableHeaderPage.getClickableLogo().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
    }

    @Test
    public void projektiMenuOptionAppears() {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        Assert.assertTrue(clickableHeaderPage.getProjektiHeaderMenu().isDisplayed());
        Actions action = new Actions(driver);
        action.moveToElement(clickableHeaderPage.getProjektiHeaderMenu()).build().perform();
        Assert.assertTrue(clickableHeaderPage.getUIzgradnjiMenuOption().isDisplayed());
    }

    @Test
    public void projektiUIzgradnjiOptionIsClickable() {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        Assert.assertTrue(clickableHeaderPage.getProjektiHeaderMenu().isDisplayed());
        clickableHeaderPage.getProjektiHeaderMenu().click();
        Assert.assertTrue(clickableHeaderPage.getUIzgradnjiMenuOption().isDisplayed());
        clickableHeaderPage.getUIzgradnjiMenuOption().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String newURL = driver.getCurrentUrl();
        Assert.assertEquals(uIzgradnjiPage.getUIzgradnjiURL(), newURL);
    }

    @Test
    public void projektiUskoroUPonudiOptionIsClickable() {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        Assert.assertTrue(clickableHeaderPage.getProjektiHeaderMenu().isDisplayed());
        clickableHeaderPage.getProjektiHeaderMenu().click();
        Assert.assertTrue(clickableHeaderPage.getUskoroUPonudiMenuOption().isDisplayed());
        clickableHeaderPage.getUskoroUPonudiMenuOption().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String newURL = driver.getCurrentUrl();
        Assert.assertEquals(uskoroUPonudiPage.getUskoroUPonudiURL(), newURL);
    }

    @Test
    public void projektiIzgradjeniObjektiOptionIsClickable() {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        Assert.assertTrue(clickableHeaderPage.getProjektiHeaderMenu().isDisplayed());
        clickableHeaderPage.getProjektiHeaderMenu().click();
        Assert.assertTrue(clickableHeaderPage.getIzgradjeniObjektiMenuOption().isDisplayed());
        clickableHeaderPage.getIzgradjeniObjektiMenuOption().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String newURL = driver.getCurrentUrl();
        Assert.assertEquals(izgradjeniObjektiPage.getIzgradjeniObjektiURL(), newURL);
    }

    @Test
    public void oNamaHeaderElementIsClickable() {
        Assert.assertEquals(driver.getCurrentUrl(), contactHeaderPage.getHomePageURL());
        Assert.assertTrue(clickableHeaderPage.getONamaHeaderElement().isDisplayed());
        clickableHeaderPage.getONamaHeaderElement().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String newURL = driver.getCurrentUrl();
        Assert.assertEquals(oNamaPage.getONamaURL(), newURL);
    }

    @AfterMethod
    public void removeCookies() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        //    driver.navigate().refresh();
    }

}
