package org.example.Testcase;

import org.example.actions.PageObject.HomePageObject;
import org.example.actions.PageObject.LoginPageObject;
import org.example.actions.PageObject.MyDashBoardPageObject;
import org.example.actions.PageObject.PageGeneralManager;
import org.example.cores.Commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateItems extends BaseTest {
    WebDriver driver;
    HomePageObject homePageObject;
    LoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;


    @Parameters({"browser"})
    @BeforeClass
    public void beforeClass(String browser){
        driver = openBrowser(browser);
        homePageObject = PageGeneralManager.openHomePage(driver);
        homePageObject.getURl();
        homePageObject.clickToLogin();
        homePageObject.inPutNameStore();
        loginPageObject = homePageObject.clickToStore();
        loginPageObject.sendUserNameandPassWord();
        myDashBoardPageObject = loginPageObject.clickToManage();
        myDashBoardPageObject.verifyToDashBoard();


    }

    @Test
    public void TC_01(){

    }
}
