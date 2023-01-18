package org.example.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Main {
    WebDriver driver;
    WebDriverWait webDriverWait;
    JavascriptExecutor getjs;

    @BeforeClass
    public void BeforeClass(){

        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }

    @Test
    public void TC_01_Test(){
        getResult("//input[@title = 'Tìm kiếm']","ok","be","de");
    }


    public void getResult(String element,String... values){
        for (String value:values) {
            driver.findElement(By.xpath(element)).sendKeys(value);
        }
    }


}