package org.example.actions.PageObject;

import org.example.InterfaceUI.HeaderPageUI;
import org.example.InterfaceUI.MyDashBoardUI;
import org.example.cores.Commons.BasePage;
import org.openqa.selenium.WebDriver;

public class HeaderPageObject extends BasePage {
    WebDriver driver;

    public HeaderPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public HeaderPageObject openHeaderPageObject(){
        return new HeaderPageObject(driver);
    }

    public CreateOrderPageObject clickToCreateOrder(){
        moveMouseToElementStringFormat(HeaderPageUI.HEADER_CHOOSE,"Giao dịch");
        clickStringFormat(HeaderPageUI.HEADER_CHOOSE,"Giao dịch");
        //clickToElement(HeaderPageUI.ITEMS_TRANSACTION);
        moveMouseToElement(HeaderPageUI.CREATE_ORDERS);
        clickToElement(HeaderPageUI.CREATE_ORDERS);
        return PageGeneralManager.openCreateOrderPage(driver);
    }
    
    public MyDashBoardPageObject clickToMyDashBoard(){
        clickStringFormat(HeaderPageUI.HEADER_CHOOSE,"Tổng quan");
        return PageGeneralManager.openMyDashBoard(driver);
    }

    public CustomerPageObject clickToCustomer(){
        moveMouseToElementStringFormat(HeaderPageUI.HEADER_CHOOSE,"Đối tác");
        clickStringFormat(HeaderPageUI.HEADER_CHOOSE,"Đối tác");
        moveMouseToElement(HeaderPageUI.CUSTOMER);
        clickToElement(HeaderPageUI.CUSTOMER);
        return PageGeneralManager.openCustomerPage(driver);
    }

    public ProductPageObject clickToCreateProductsFromHeader(){
        clickStringFormat(MyDashBoardUI.ITEMS_LOCATOR_HEADER,"Hàng hóa");
        clickStringFormat(MyDashBoardUI.ITEMS_MENU,"Danh mục");
        return PageGeneralManager.openCreateProduct(driver);
    }



}
