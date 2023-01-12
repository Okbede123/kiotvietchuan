package org.example.Testcase;



import org.example.actions.PageObject.*;
import org.example.cores.commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInStore extends BaseTest {
    WebDriver driver;
    HomePageObject homePageObject;
    LoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;
    PosOnlineObject posOnlineObject;

    TikTokPageObject tikTokPageObject;

    TikTokLoginPageObject tikTokLoginPageObject;

    @BeforeClass
    public void BeforeClass(){
        driver = openBrowser("chrome");
       homePageObject = PageGeneralManager.openHomePage(driver);
        homePageObject.getURl();
    }

    @Test
    public void TC_01_ClickToLogin(){
        homePageObject.clickToLogin();
        homePageObject.inPutNameStore();
       loginPageObject = homePageObject.clickToStore();
    }

    @Test
    public void TC_02_GoToStore(){
        loginPageObject.sendUserNameandPassWord();
        myDashBoardPageObject = loginPageObject.clickToManage();
        myDashBoardPageObject.verifyToDashBoard();
    }

    @Test
    public void TC_03_GoToPosOnline(){
        posOnlineObject = myDashBoardPageObject.clickToSellerOnline();
        verifyTrue(posOnlineObject.isPosOnlinePageObject());
        posOnlineObject.checkFBPosDisplay();
        posOnlineObject.clickToSetting();
        verifyTrue(posOnlineObject.isDisplayConnectionSetting());
        posOnlineObject.clickAddTikTokSeller();
        verifyTrue(posOnlineObject.isDisplayAddOmniChannel());
    }

    @Test
    public void TC_04_TiktokAddSeller(){
        tikTokPageObject = posOnlineObject.clickToLoginOmniChannel();
        tikTokPageObject.clickToSellerAsian();
        tikTokLoginPageObject = tikTokPageObject.clicktoLoginTikTokSeller();
        tikTokLoginPageObject.loginWithEmail();
        tikTokLoginPageObject.sendEmailTextBox("yuanxing.thm+0018@bytedance.com");
        tikTokLoginPageObject.sendPassTextBox("a123456!");
        tikTokLoginPageObject.clickLogin();
    }

}
