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
        //System.setProperty(khoiTaoDriver.khoiTaoChomre,khoiTaoDriver.getProperty+khoiTaoDriver.source);
        driver = new ChromeDriver();
        //driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void TC_01_Visible(){
        //Visible: có trên UI và có trong DOM/HTML
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#email")));
        Assert.assertTrue(driver.findElement(By.cssSelector("input#email")).isDisplayed());
    }


}