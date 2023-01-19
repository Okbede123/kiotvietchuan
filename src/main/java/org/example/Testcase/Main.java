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
        driver.get("https://blueimp.github.io/jQuery-File-Upload/");
        String test = System.getProperty("user.dir");
        System.out.println(test);

    }

    @Test
    public void TC_01_Test(){
        driver.findElement(By.xpath("//input[@type = 'file']")).sendKeys("C:\\SAVE\\unnamed.jpg");
    }





}