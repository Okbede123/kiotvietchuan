package org.example.Testcase;

import com.aventstack.extentreports.Status;
import org.example.actions.PageObject.*;
import org.example.cores.Commons.BaseTest;
import org.example.cores.Commons.ReportConfig.ExtentManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class CreateItems extends BaseTest {
    WebDriver driver;
    HomePageObject homePageObject;
    LoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;
    ProductPageObject productPageObject;


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
    public void TC_01_CreateItem(Method method){
        ExtentManager.startTest(method.getName(),"start Click CreateOrder");
        ExtentManager.getTest().log(Status.INFO,"input information");
        productPageObject = myDashBoardPageObject.clickToCreateProducts();
        productPageObject.clickToCreateHeader();
        productPageObject.inputInformationItem();
    }
}
