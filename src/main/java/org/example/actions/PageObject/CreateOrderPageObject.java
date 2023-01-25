package org.example.actions.PageObject;

import org.example.InterfaceUI.CreateOrderPageUI;
import org.example.cores.Commons.BasePage;
import org.openqa.selenium.WebDriver;

public class CreateOrderPageObject extends HeaderPageObject {
    WebDriver driver;

    public CreateOrderPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public SaleOrderPageObject clickCreateOrder(){
        clickToElement(CreateOrderPageUI.CREATE_ORDERS);
        return PageGeneralManager.openSaleOrderPage(driver);
    }
}
