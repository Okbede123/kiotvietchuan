package org.example.actions.PageObject;

import org.example.InterfaceUI.SaleOrderPageUI;
import org.example.cores.Commons.BasePage;
import org.example.cores.Commons.GlobalConstant;
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

    public void inputNoteBill(String value){
        sendKey(SaleOrderPageUI.INPUT_NOTE_BILL,value);
    }

    public void searchCustomerandChoosePrice(String value,String contactNumber,String address,String locator,String ward){
        sendKey(SaleOrderPageUI.SEARCH_CUSTOMER,value);
        clickByJsStringFormat(SaleOrderPageUI.CLICK_CUSTOMER,value);
        clickByJs(SaleOrderPageUI.CHOOSE_PRICE_LIST);
        clickByJs(SaleOrderPageUI.CHOOSE_PRICE_FROM_LIST);
        sendKeyStringFormat(SaleOrderPageUI.INPUT_LOCATOR_INFORMATION,"Điện thoại",contactNumber);
        sendKeyStringFormat(SaleOrderPageUI.INPUT_LOCATOR_INFORMATION,"Địa chỉ",address);
        sendKeyStringFormat(SaleOrderPageUI.INPUT_LOCATOR_INFORMATION,"Khu vực",locator);
        sleepintime(1);
        sendKeyStringFormat(SaleOrderPageUI.INPUT_LOCATOR_INFORMATION,"Phường xã",ward);
        clickByJs(SaleOrderPageUI.CHOOSE_WEIGHT_ITEMS_LIST);
        clickByJsStringFormat(SaleOrderPageUI.CHOOSE_WEIGHT_ITEMS,"kg");
        sendKey(SaleOrderPageUI.INPUT_WEIGHT_ITEMS,"2");
        sendKey(SaleOrderPageUI.INPUT_HIGH_ITEMS,"2");
        sendKey(SaleOrderPageUI.INPUT_LONG_ITEMS,"3");
        sendKey(SaleOrderPageUI.INPUT_WIDE_ITEMS,"4");
        sendKey(SaleOrderPageUI.NOTE_BILL_SHIP,"nho giao hang chuan nha");
        clickByJs(SaleOrderPageUI.CHOOSE_SHIPPER_CARRIES);
        clickByJs(SaleOrderPageUI.CHECK_BOX_PRICE_DECLARATION);
        clickByJs(SaleOrderPageUI.CHECK_BOX_PRICE_SENT_AT_THE_POST_OFFICE);
        clickByJs(SaleOrderPageUI.RADIO_BOX_PAID_RECIPIENTS);
        clickByJs(SaleOrderPageUI.COLLECT_MONEY_TO_SEE_ITEM);
        clickByJs(SaleOrderPageUI.CHECK_ITEMS);
        clickByJs(SaleOrderPageUI.TRY_ITEMS);
    }

    public boolean verifyCheckBoxShipper(){
        return searchElement(SaleOrderPageUI.RADIO_CHECKBOX_SHIPPER_CARRIES).isSelected();
    }

    public boolean verifyCheckBoxPriceDeclaration(){
        return searchElement(SaleOrderPageUI.CHECK_BOX_PRICE_DECLARATION_VERIFY).isSelected();
    }

    public boolean verifyRadioBoxPaidReceipents(){
        return searchElement(SaleOrderPageUI.RADIO_BOX_PAID_RECIPIENTS_VERIFY).isSelected();
    }

    public boolean verifyCheckBoxCollectMoneyToSeeItem(){
        return searchElement(SaleOrderPageUI.COLLECT_MONEY_TO_SEE_ITEM_VERIFY_CHECKBOX).isSelected();
    }

    public String verifyletTryItems(){
        return searchElement(SaleOrderPageUI.TRY_ITEMS_VERIFY).getText();
    }

    public void inputInformationBill(String value){
        sendKey(SaleOrderPageUI.CUSTOMER_PAY,value);
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
