package org.example.Testcase;

import org.example.actions.PageObject.*;
import org.example.cores.Commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class GetNameItemCreate extends BaseTest {

    WebDriver driver;

    HomePageObject homePageObject;
    LoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;
    ProductPageObject productPageObject;

    public static String nameItem;

    @Parameters({"browser"})
    @BeforeTest
    public void beforeTest(String browser){
        driver = openBrowser(browser);
        homePageObject = PageGeneralManager.openHomePage(driver);
        homePageObject.getURl();
        homePageObject.clickToLogin();
        homePageObject.inPutNameStore();
        loginPageObject = homePageObject.clickToStore();
        loginPageObject.sendUserNameandPassWord();
        myDashBoardPageObject = loginPageObject.clickToManage();
        myDashBoardPageObject.verifyToDashBoard();
        productPageObject = myDashBoardPageObject.clickToCreateProducts();
        productPageObject.clickToCreateHeader();
        productPageObject.inputInformationItem();
        nameItem = ProductPageObject.getNameItem;
        driver.quit();
    }

}
