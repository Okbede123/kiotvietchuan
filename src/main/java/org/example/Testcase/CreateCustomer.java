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

public class CreateCustomer extends BaseTest {

    WebDriver driver;
    LoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;
    CustomerPageObject customerPageObject;


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
    public void TC_01_CreateCustomer(Method method){
        ExtentManager.startTest(method.getName(),"start Click CreateCustomer");
        ExtentManager.getTest().log(Status.INFO,"click to create customer");
        customerPageObject = myDashBoardPageObject.openHeaderPageObject().clickToCustomer();
        customerPageObject.createCustomer();
        customerPageObject.inputInfomationCustomer("than tai","0812675","Nam","hà","Đồng Văn","xã","Lũng Cú");

    }
}
