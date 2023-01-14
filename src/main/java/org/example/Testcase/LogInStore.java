package org.example.Testcase;



import org.example.actions.PageObject.*;
import org.example.cores.Commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInStore extends BaseTest {
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

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}
