package org.example.Testcase;



import com.aventstack.extentreports.Status;
import org.example.actions.PageObject.*;
import org.example.cores.Commons.BaseTest;
import org.example.cores.Commons.ReportConfig.ExtentManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

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
    public void TC_01_ClickToLogin(Method method){
        ExtentManager.startTest(method.getName(),"start Click To Login");
        ExtentManager.getTest().log(Status.INFO,"Click to Login");
        homePageObject.clickToLogin();
        ExtentManager.getTest().log(Status.INFO,"Input Name Store Seller");
        homePageObject.inPutNameStore();
        ExtentManager.getTest().log(Status.INFO,"Click to Store Seller");
       loginPageObject = homePageObject.clickToStore();
    }

    @Test
    public void TC_02_GoToStore(Method method){
        ExtentManager.startTest(method.getName(),"Go to store seller");
        ExtentManager.getTest().log(Status.INFO,"Send username and password");
        loginPageObject.sendUserNameandPassWord();
        ExtentManager.getTest().log(Status.INFO,"Go to manager");
        myDashBoardPageObject = loginPageObject.clickToManage();
        ExtentManager.getTest().log(Status.INFO,"Verify is dashboard manager");
        myDashBoardPageObject.verifyToDashBoard();
    }

    @Test
    public void TC_03_GoToPosOnline(Method method){
        ExtentManager.startTest(method.getName(),"Go to Pos Online");
        ExtentManager.getTest().log(Status.INFO,"Click to Seller Online");
        posOnlineObject = myDashBoardPageObject.clickToSellerOnline();
        ExtentManager.getTest().log(Status.INFO,"Verify is Pos Online Page");
        verifyTrue(posOnlineObject.isPosOnlinePageObject());
        posOnlineObject.checkFBPosDisplay();
        ExtentManager.getTest().log(Status.INFO,"Click To Setting");
        posOnlineObject.clickToSetting();
        Assert.assertTrue(posOnlineObject.isDisplayConnectionSetting());
        ExtentManager.getTest().log(Status.INFO,"Add Tiktok seller");
        posOnlineObject.clickAddTikTokSeller();
        ExtentManager.getTest().log(Status.INFO,"Verify is screen display add omni channel");
        Assert.assertFalse(posOnlineObject.isDisplayAddOmniChannel());
    }

    @Test
    public void TC_04_TiktokAddSeller(Method method){
        ExtentManager.startTest(method.getName(),"Add tiktok shop seller");
        ExtentManager.getTest().log(Status.INFO,"Click to Login ommi channel");
        tikTokPageObject = posOnlineObject.clickToLoginOmniChannel();
        ExtentManager.getTest().log(Status.INFO,"Click to Seller Asian");
        tikTokPageObject.clickToSellerAsian();
        ExtentManager.getTest().log(Status.INFO,"Click to login");
        tikTokLoginPageObject = tikTokPageObject.clicktoLoginTikTokSeller();
        ExtentManager.getTest().log(Status.INFO,"login with email");
        tikTokLoginPageObject.loginWithEmail();
        ExtentManager.getTest().log(Status.INFO,"send user name and password");
        tikTokLoginPageObject.sendEmailTextBox("yuanxing.thm+0018@bytedance.com");
        tikTokLoginPageObject.sendPassTextBox("a123456!");
        ExtentManager.getTest().log(Status.INFO,"click to login");
        tikTokLoginPageObject.clickLogin();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}
