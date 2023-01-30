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

public class CreateOrder extends BaseTest {

    WebDriver driver;
    LoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;

    CreateOrderPageObject createOrderPageObject;
    SaleOrderPageObject saleOrderPageObject;
    PosOnlineObject posOnlineObject;


    @Parameters({"browser"})
    @BeforeClass
    public void beforeClass(String browser){
        driver = openBrowser(browser);
        loginPageObject = PageGeneralManager.openLoginPage(driver);
        loginPageObject.getToSellerUrl();
        loginPageObject.sendUserNameandPassWord();
        myDashBoardPageObject = loginPageObject.clickToManage();
    }

    //@Test
    public void TC_01_EditOrderBill(Method method){
        ExtentManager.startTest(method.getName(),"start Click EditOrder");
        ExtentManager.getTest().log(Status.INFO,"click to edit order");
        createOrderPageObject = myDashBoardPageObject.getHeaderPageObject().clickToCreateOrder();
        createOrderPageObject.clickToDetailBillOrder("DHLZD_392562693522882","123123");
        createOrderPageObject.chooseLocator("Hà ");
        createOrderPageObject.chooseServiceShip("Giao nhanh");
    }

    //@Test
    public void TC_02_GoToMappingItems(Method method){
        ExtentManager.startTest(method.getName(),"Tc2 start Click CreateOrder");
        ExtentManager.getTest().log(Status.INFO,"click to create order");
        //createOrderPageObject = myDashBoardPageObject.clickToCreateOrder();
        createOrderPageObject = myDashBoardPageObject.getHeaderPageObject().clickToCreateOrder();
        posOnlineObject = createOrderPageObject.clickToPosOnlineMappingItems();
        posOnlineObject.checkFBPosDisplay();
        posOnlineObject.clickToMappingItems("DHLZD_392631083006490");

    }

    //@Test
    public void TC_03_GoToMyDashBoardFromCreateOrder(Method method){
        ExtentManager.startTest(method.getName(),"Tc2 start Click CreateOrder");
        ExtentManager.getTest().log(Status.INFO,"click to create order");
        createOrderPageObject = myDashBoardPageObject.getHeaderPageObject().clickToCreateOrder();
        myDashBoardPageObject = createOrderPageObject.getHeaderPageObject().clickToMyDashBoard();
    }

    @Test
    public void TC_04_CreateOrderBills(Method method){
        ExtentManager.startTest(method.getName(),"start Click CreateOrder");
        ExtentManager.getTest().log(Status.INFO,"click to create order");
        createOrderPageObject = myDashBoardPageObject.openHeaderPageObject().clickToCreateOrder();
       saleOrderPageObject = createOrderPageObject.clickCreateOrder();
       saleOrderPageObject.turnOffToolTip();
       saleOrderPageObject.sendNameToOrdersHandleToolTip("okbede","SP9934430182");
       saleOrderPageObject.inputItemsInformation("5","7600");
       saleOrderPageObject.sendNameToOrders("okbede","SP9934430183");
       saleOrderPageObject.inputNoteBill("giao hang can than");
       saleOrderPageObject.searchCustomerandChoosePrice("Vũ Minh Đức","0563886668","test","Hà Giang - Thành phố Hà Giang","Phường Minh Khai");
       saleOrderPageObject.inputInformationBill("10000");
       verifyTrue(saleOrderPageObject.verifyCheckBoxShipper());
       verifyTrue(saleOrderPageObject.verifyCheckBoxPriceDeclaration());
       verifyTrue(saleOrderPageObject.verifyRadioBoxPaidReceipents());
       verifyTrue(saleOrderPageObject.verifyCheckBoxCollectMoneyToSeeItem());
       verifyEqual(saleOrderPageObject.verifyletTryItems(),"Cho thử hàng");
    }
}
