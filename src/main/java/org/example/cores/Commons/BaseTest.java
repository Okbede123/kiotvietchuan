package org.example.cores.Commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BaseTest {

    public enum switchPage{
        CHROME,FIREFOX,EDGE
    }

    WebDriver driver;
    private static String nameBrowser;

    //private static Object nameBrowserEnum;

    public  WebDriver openBrowserEnum(switchPage page){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
        switch (page){
            case FIREFOX:{
                driver = new FirefoxDriver();
                break;
            }
            case CHROME:{
                driver = new ChromeDriver();
                break;
            }
            case EDGE:{
                driver = new EdgeDriver();
                break;
            }
            default:{
                throw new RuntimeException("not found driver");
            }
        }
        //nameBrowserEnum = page;
        //System.out.println(nameBrowserEnum);
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver openBrowser(String browser){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
        switch (browser){
            case "firefox":{
                driver = new FirefoxDriver();
                break;
            }
            case "chrome":{
                driver = new ChromeDriver();
                break;
            }
            case "edge":{
                driver = new EdgeDriver();
                break;
            }
            default:{
                throw new RuntimeException("not found driver");
            }
        }
        nameBrowser = browser;
        return driver;
    }

    public static String getNameBrowser(){
        return nameBrowser;
    }


    public boolean verifyTrue(boolean verify){
        boolean status = true;
        try {
            Assert.assertTrue(verify);
        }catch (Throwable e){
            status = false;
            System.out.println(e);
        }
        return  status;
    }

    public boolean verifyFalse(boolean verify){
        boolean status = false;
        try {
            Assert.assertFalse(verify);
        }catch (Throwable e){
            status = true;
            System.out.println(e);
        }
        return  status;
    }

    public boolean verifyEqual(Object actual, Object exptected){
        boolean status = true;
        try {
            Assert.assertEquals(actual,exptected);
        }catch (Throwable e){
            System.out.println(e);
            status = false;
        }
        return status;
    }

    public void waitInTime(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
