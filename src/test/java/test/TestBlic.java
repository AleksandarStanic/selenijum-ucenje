package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.Keys.RETURN;

public class TestBlic {

    @Test
    public void proveridropBox() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://toolsqa.com/automation-practice-form/");



//nqcin 1
        Select dropdown = new Select(webDriver.findElement(By.id("continents")));
        List<WebElement> opt = dropdown.getOptions();

        boolean indikator = false;

        for(WebElement we :opt){
            if(we.getText().equals("Australia")){
            indikator = true;
            break;
            }
        }
        Assert.assertTrue(indikator);



        //nacin 2
      //  Select dropdown = new Select(webDriver.findElement(By.id("continents")));
       // dropdown.selectByVisibleText("Australia");
       // Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Australia");



             webDriver.close();

    }

    @Test
    public void proveriCheckBox() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://toolsqa.com/automation-practice-form/");
        webDriver.findElement(By.id("tool-2")).click();

        Assert.assertTrue(webDriver.findElement(By.id("tool-2")).isSelected());

 }}


