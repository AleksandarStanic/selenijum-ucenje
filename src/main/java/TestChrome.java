import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestChrome {

    @Test
    public void aserrtovanje(){

        int a = 2;
        int b = 3;
        int c = a + b;

        Assert.assertTrue(c > b);

        Assert.assertEquals(5, c);

//        Assert.assertEquals(4, c);




    }


    @Test

    public void proveriAdresu() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");
        WebElement textBox = webDriver.findElement(By.name("q"));
        textBox.sendKeys("duka bazuka", Keys.RETURN);

        Assert.assertTrue(webDriver.getCurrentUrl().contains("google"));

        Thread.sleep(1000);
        TimeUnit.SECONDS.sleep(1);

        Assert.assertTrue(webDriver.getCurrentUrl().contains("duka"));
        Assert.assertTrue(webDriver.getCurrentUrl().contains("bazuka"));


        webDriver.close();
    }

    @Test
    public void popuniSveNaFakeSajtu(){
// otvaraju browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

// da ode na sajt - http://toolsqa.com/automation-practice-form/
        webDriver.get("http://toolsqa.com/automation-practice-form/");

//  popouni ime
        webDriver.findElement(By.name("firstname")).sendKeys("Dusko");
        webDriver.findElement(By.name("lastname")).sendKeys("Zorka");

//sex ?   yes please
        webDriver.findElement(By.id("sex-1")).click();
        webDriver.findElement(By.id("exp-1")).click();

        webDriver.findElement(By.id("datepicker")).sendKeys("31.07.1987.");


        webDriver.findElement(By.id("photo")).sendKeys("C:\\Users\\User\\Desktop\\Sloba_mira.jpg");


//  zatvara browser
        webDriver.close();
    }

//    proveri da li ima Australija u droplisti kontinenata

//    dodao sam novi test

}
