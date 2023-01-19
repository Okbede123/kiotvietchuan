package org.example.Testcase;

import org.example.actions.PageObject.*;
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
    public void TC_01(){
    productPageObject = myDashBoardPageObject.clickToCreateProducts();
    productPageObject.clickToCreateHeader();
    productPageObject.inputInformationItem();

    }
}
