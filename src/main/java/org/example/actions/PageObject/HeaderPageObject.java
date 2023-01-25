package org.example.actions.PageObject;

import org.example.InterfaceUI.HeaderPageUI;
import org.example.cores.Commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HeaderPageObject extends BasePage {
    WebDriver driver;

    public HeaderPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public CreateOrderPageObject clickToCreateOrder(){
        moveMouseToElement(HeaderPageUI.ITEMS_TRANSACTION);
        clickToElement(HeaderPageUI.ITEMS_TRANSACTION);
        moveMouseToElement(HeaderPageUI.CREATE_ORDERS);
        clickToElement(HeaderPageUI.CREATE_ORDERS);
        return PageGeneralManager.openCreateOrderPage(driver);
    }
    
    public MyDashBoardPageObject clickToMyDashBoard(){
        clickToElement(HeaderPageUI.MY_DASHBOARD);
        return PageGeneralManager.openMyDashBoard(driver);
    }

}
