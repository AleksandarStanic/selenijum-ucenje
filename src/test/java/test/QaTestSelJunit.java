package test;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class QaTestSelJunit {


    private static ChromeDriver driver;
    WebElement element;
    private long secCekanja = 10;

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("SAD CU DA CEKAM " + secCekanja);
        driver.manage().timeouts().implicitlyWait(secCekanja, TimeUnit.SECONDS);
    }

    @Test
    public void valid_UserCredential() {

        driver.get("http://toolsqa.com/automation-practice-form/");
        Assert.assertTrue(driver.getCurrentUrl().contains("practice"));

    }

    @Test
    public void inValid_UserCredential() {
        System.out.println("Starting test " + new Object() {
        }.getClass().getEnclosingMethod().getName());
        driver.get("http://www.store.demoqa.com");
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        driver.findElement(By.id("log")).sendKeys("testuser");
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
        driver.findElement(By.id("login")).click();
        try {
            element = driver.findElement(By.xpath(".//*[@id='account_logout']/a"));
        } catch (Exception e) {
        }
        Assert.assertNotNull(element);
        System.out.println("Ending test " + new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
