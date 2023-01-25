package org.example.Testcase;

import com.aventstack.extentreports.Status;
import org.example.actions.PageObject.*;
import org.example.cores.Commons.BaseTest;
import org.example.cores.Commons.ReportConfig.ExtentManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class CreateOrder extends BaseTest {

    WebDriver driver;
    LoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;

    CreateOrderPageObject createOrderPageObject;
    SaleOrderPageObject saleOrderPageObject;


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
    public void TC_01_CreateOrders(Method method){
        ExtentManager.startTest(method.getName(),"start Click CreateOrder");
        ExtentManager.getTest().log(Status.INFO,"click to create order");
        createOrderPageObject = myDashBoardPageObject.clickToCreateOrder();
        saleOrderPageObject = createOrderPageObject.clickCreateOrder();
        saleOrderPageObject.sendNameToOrders("okbede");
    }

}
