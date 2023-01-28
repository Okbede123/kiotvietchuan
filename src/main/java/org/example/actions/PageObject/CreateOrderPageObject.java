package org.example.actions.PageObject;

import org.example.InterfaceUI.CreateOrderPageUI;
import org.example.cores.Commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public void clickToDetailBillOrder(String codebill,String contactnumber){
        clickStringFormat(CreateOrderPageUI.CODE_BILLS,codebill);
        sendKey(CreateOrderPageUI.INPUT_CONTACTNUMBER,contactnumber);
    }

    public void chooseLocator(String value){
        sendKey(CreateOrderPageUI.INPUT_LOCATOR, value);
        for (WebElement e :searchElements(CreateOrderPageUI.LOCATOR_CHOOSE_LIST)){
            if(e.getAttribute("val").contains("Bắc Mê")){
                e.click();
                clickToElement(CreateOrderPageUI.INPUT_LOCATOR);
                break;
            }
        }
    }

    public void chooseServiceShip(String valueShip){
        clickToElement(CreateOrderPageUI.SERVICE_SHIP);
        clickStringFormat(CreateOrderPageUI.CHOOSE_SERVICE_SHIP,valueShip);
    }

    public PosOnlineObject clickToPosOnlineMappingItems(){
        clickToElement(CreateOrderPageUI.MAPPING_ITEMS);
        return PageGeneralManager.openPosOnline(driver);
    }
}
