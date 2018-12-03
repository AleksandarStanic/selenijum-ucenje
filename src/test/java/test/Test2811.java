package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;
import static org.openqa.selenium.Keys.RETURN;

public class Test2811 {

    WebDriver webDriver;

    @After
    public void zatvoriWebDriver(){
        webDriver.close();

    }

    @Test
    public void prvaProvera() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();

        webDriver.get("http://toolsqa.com/automation-practice-form/");


        //ime i prezime

        WebElement ime = webDriver.findElement(By.name("firstname"));
        ime.sendKeys("Smilja");

        WebElement prezime = webDriver.findElement(By.name("lastname"));
        prezime.sendKeys("Tomic", Keys.RETURN);



        Assert.assertTrue(webDriver.getCurrentUrl().contains("Smilja"));
        Assert.assertTrue(webDriver.getCurrentUrl().contains("Tomic"));

        //pol
        webDriver.findElement(By.id("sex-1")).click();
        Assert.assertTrue(webDriver.findElement(By.id("sex-1")).isSelected());



        //zanimanje
        WebElement proffesion = webDriver.findElement(By.id("profession-0"));
        proffesion.click();
        Assert.assertTrue(webDriver.findElement(By.id("profession-0")).isSelected());

        webDriver.findElement(By.id("profession-1")).click();
        Assert.assertTrue(webDriver.findElement(By.id("profession-1")).isSelected());

        webDriver.close();
    }


    @Test
    public void drugaProvera() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.google.com");
        WebElement serach = webDriver.findElement(By.name("q"));
        serach.sendKeys("gmail",Keys.RETURN);

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.className("LC20lb")).click();
        Thread.sleep(2000);

        webDriver.get("https://www.blic.rs");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.xpath("//*[@id=\"top\"]/div[4]/div/nav/ul/li[6]/a")).click();
        webDriver.findElement(By.xpath("/html/body/main/div/section/div[2]/section/article[1]/div/h3/a")).click();


        Assert.assertTrue(webDriver.getCurrentUrl().contains("dijagnostiku"));







//        WebElement komentar =  webDriver.findElement(By.xpath("//*[@id=\"komentari\"]/div/div/div[1]/span"));
//        komentar.click();
//
//        komentar.sendKeys("Selenijum aca");

        }




        @Test public void trecaProvera() throws InterruptedException{

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
            WebDriver webDriver = new ChromeDriver();

            webDriver.get("https://www.blic.rs");
            webDriver.manage().window().maximize();
            webDriver.findElement(By.xpath("//*[@id=\"top\"]/div[4]/div/nav/ul/li[6]/a")).click();
            webDriver.findElement(By.xpath("/html/body/main/div/section/div[2]/section/article[1]/div/h3/a")).click();



           // WebElement myDynamicElement = (new WebDriverWait(webDriver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")));

        }



}
