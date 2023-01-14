package org.example.Testcase;

import org.example.actions.PageObject.*;
import org.example.cores.Commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
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
        myDashBoardPageObject = loginPageObject.clickToManage();
        //myDashBoardPageObject.verifyToDashBoard();
    }

    @Test
    public void TC_02_GoToPosOnline(){
        myDashBoardPageObject.clickToSellerOnline();
//        verifyTrue(posOnlineObject.isPosOnlinePageObject());
//        posOnlineObject.checkFBPosDisplay();
//        posOnlineObject.clickToSetting();
//        verifyTrue(posOnlineObject.isDisplayConnectionSetting());
//        posOnlineObject.clickAddTikTokSeller();
//        verifyTrue(posOnlineObject.isDisplayAddOmniChannel());
    }

    //@Test
    public void TC_03_TiktokAddSeller(){
        tikTokPageObject = posOnlineObject.clickToLoginOmniChannel();
        tikTokPageObject.clickToSellerAsian();
        tikTokLoginPageObject = tikTokPageObject.clicktoLoginTikTokSeller();
        tikTokLoginPageObject.loginWithEmail();
        tikTokLoginPageObject.sendEmailTextBox("yuanxing.thm+0018@bytedance.com");
        tikTokLoginPageObject.sendPassTextBox("a123456!");
        tikTokLoginPageObject.clickLogin();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
