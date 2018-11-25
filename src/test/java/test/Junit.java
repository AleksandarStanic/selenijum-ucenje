package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {




    @Test

    public void proveriAdresu(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");
        WebElement textBox = webDriver.findElement(By.name("q"));
        textBox.sendKeys("duka bazuka", Keys.RETURN);

        Assert.assertTrue(webDriver.getCurrentUrl().contains("google"));


        webDriver.close();
    }
}
