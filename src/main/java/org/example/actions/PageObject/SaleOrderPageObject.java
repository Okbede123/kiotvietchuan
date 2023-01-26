package org.example.actions.PageObject;

import org.example.InterfaceUI.SaleOrderPageUI;
import org.example.cores.Commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SaleOrderPageObject extends BasePage {
    WebDriver driver;
    public SaleOrderPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void sendNameToOrders(String value){
        //clickToElement(SaleOrderPageUI.OFF_POPUP);
        sendKey(SaleOrderPageUI.TEXTBOX_NAME_ORDERS,value);
        clickStringFormat(SaleOrderPageUI.CODE_ITEMS,"SP9934430182");
    }


}
