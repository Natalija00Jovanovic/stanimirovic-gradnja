package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;

    public WebDriverWait wait;

    public ContactHeaderPage contactHeaderPage;

    public ClickableHeaderPage clickableHeaderPage;

    public UIzgradnjiPage uIzgradnjiPage;

    public UskoroUPonudiPage uskoroUPonudiPage;

    public IzgradjeniObjektiPage izgradjeniObjektiPage;

    public ONamaPage oNamaPage;

    public KontaktPage kontaktPage;

    public SiteFooterPage siteFooterPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        contactHeaderPage = new ContactHeaderPage(driver);
        clickableHeaderPage = new ClickableHeaderPage(driver);
        uIzgradnjiPage = new UIzgradnjiPage(driver);
        uskoroUPonudiPage = new UskoroUPonudiPage(driver);
        izgradjeniObjektiPage = new IzgradjeniObjektiPage(driver);
        oNamaPage = new ONamaPage(driver);
        kontaktPage = new KontaktPage(driver);
        siteFooterPage = new SiteFooterPage(driver);
    }

    public void scrollToElement(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
