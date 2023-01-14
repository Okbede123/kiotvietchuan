package org.example.Testcase;

import org.example.actions.PageObject.*;
import org.example.cores.Commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginToStore2 extends BaseTest {

    WebDriver driver;
    HomePageObject homePageObject;
    LoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;
    PosOnlineObject posOnlineObject;

    TikTokPageObject tikTokPageObject;

    TikTokLoginPageObject tikTokLoginPageObject;

    @Parameters({"browser"})
    @BeforeClass
    public void BeforeClass(String browserName){
        driver = openBrowser(browserName);
        loginPageObject = PageGeneralManager.openLoginPage(driver);
        loginPageObject.getToSellerUrl();
    }

    @Test
    public void TC_01_getUserNameAndPass(){
        loginPageObject.sendUserNameandPassWord();
        loginPageObject.clickToManage();
    }
}
