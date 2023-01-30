package org.example.Testcase;

import com.aventstack.extentreports.Status;
import org.example.actions.PageObject.LoginPageObject;
import org.example.actions.PageObject.MyDashBoardPageObject;
import org.example.actions.PageObject.PageGeneralManager;
import org.example.actions.PageObject.ProductPageObject;
import org.example.cores.Commons.BaseTest;
import org.example.cores.Commons.ReportConfig.ExtentManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class MappingItems extends BaseTest {

    WebDriver driver;
    LoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;
    ProductPageObject productPageObject;

    @Parameters({"browser"})
    @BeforeClass
    public void beforeClass(String browser){
        driver = openBrowser(browser);
        loginPageObject = PageGeneralManager.openLoginPage(driver);
        loginPageObject.getToSellerUrl();
        loginPageObject.sendUserNameandPassWord();
        myDashBoardPageObject = loginPageObject.clickToManage();
    }

    @Test
    public void TC_01_MappingItems(Method method){
        ExtentManager.startTest(method.getName(),"start Mapping items");
        ExtentManager.getTest().log(Status.INFO,"TC_01_MappingItems");
        productPageObject = myDashBoardPageObject.getHeaderPageObject().clickToCreateProductsFromHeader();
        productPageObject.searchNameItems(GetNameItemCreate.nameItem);
        productPageObject.mappingTikTokShop();
        verifyEqual(productPageObject.verifyNameItemMapping(),"Giấy Ăn Gấu Trúc Thùng 30 Gói (Hàng Việt Nam) - loại 1 - vàng");
    }
}
