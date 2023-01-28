package org.example.actions.PageObject;

import org.example.InterfaceUI.SaleOrderPageUI;
import org.example.cores.Commons.BasePage;
import org.example.cores.Commons.GlobalConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SaleOrderPageObject extends BasePage {
    WebDriver driver;
    public SaleOrderPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void sendNameToOrdersHandleToolTip(String value,String codeItem){
        waitElementInvisibility(GlobalConstant.ICON_LOADING);
        sendKey(SaleOrderPageUI.TEXTBOX_NAME_ORDERS,value);
        clickStringFormat(SaleOrderPageUI.CODE_ITEMS,codeItem);
        clickByJs(SaleOrderPageUI.TURN_OP_TOOLTIP_UTILITIES);
    }

    public void sendNameToOrders(String value,String codeItem){
        waitElementInvisibility(GlobalConstant.ICON_LOADING);
        sendKey(SaleOrderPageUI.TEXTBOX_NAME_ORDERS,value);
        clickStringFormat(SaleOrderPageUI.CODE_ITEMS,codeItem);
    }

    public void inputItemsInformation(String valueQuality,String priceItems){
        sendKey(SaleOrderPageUI.INPUT_QUALITY_ITEMS,valueQuality);
        clickByJs(SaleOrderPageUI.EDIT_PRICE_ITEMS_ALL);
        sendKey(SaleOrderPageUI.EDIT_PRICE_ITEMS,priceItems);
        clickByJs(SaleOrderPageUI.EDIT_PRICE_ITEMS_ALL);
    }

    public void turnOffToolTip(){
        clickByJs(SaleOrderPageUI.OFF_POPUP_TOOLTIP);
    }


}
