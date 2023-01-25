package org.example.actions.PageObject;

import org.example.InterfaceUI.ProductPageUI;
import org.example.cores.Commons.BasePage;
import org.example.cores.Commons.GlobalConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPageObject extends HeaderPageObject {

    WebDriver driver;

    public ProductPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickToCreateHeader(){
        clickStringFormat(ProductPageUI.CREATE_NEW_ORDER_HEADER,"Thêm mới");
        clickStringFormat(ProductPageUI.CREATE_ITEMS,"Thêm hàng hóa");
    }

    public void inputInformationItem(){
        sendKey(ProductPageUI.INPUT_NAME_ITEM,"okbede" + randomNum());
        waitInTime(2);
        clickToElement(ProductPageUI.GROUP_ITEMS);
        clickStringFormat(ProductPageUI.CHOOSE_GROUP,"áo phao");
        clickToElement(ProductPageUI.TRADEMARK);
        clickStringFormat(ProductPageUI.TRADEMARK_CHOOSE,"Hảo Hảo");
        clickToElement(ProductPageUI.CREATE_LOCATOR);
        sendKey(ProductPageUI.INPUT_LOCATOR,"hạ long" + randomNum());
        clickStringFormat(ProductPageUI.CLICK_CUSTOM_LOCATOR,"Lưu");
        sendKeyUpload(ProductPageUI.UPLOAD_PICTURES, GlobalConstant.LINK_PROJECT+"unnamed.jpg" + "\n" + GlobalConstant.LINK_PROJECT+ "test.jpg" + "\n" + GlobalConstant.LINK_PROJECT+"ĐỨC THẦN TÀI.png");
        clickStringFormat(ProductPageUI.PROPERTIES_ITEMS,"Thuộc tính");
        clickToElement(ProductPageUI.ADD_NEW_PROPERTIES);
        clickToElement(ProductPageUI.OPEN_DROPDOWN_PROPERTIES);
        clickStringFormat(ProductPageUI.PROPERTIES_CHOOSE,"SIZE");
        sendKey(ProductPageUI.INPUT_VALUE_PROPERTIES,"12");
        clickStringFormat(ProductPageUI.PROPERTIES_ITEMS,"Đơn vị tính ");
        sendKey(ProductPageUI.NAME_ITEM_UNIT,"cái");
        sendKey(ProductPageUI.PRICE_COST,"1200");
        sendKey(ProductPageUI.INVENTORY,"50");
        sendKey(ProductPageUI.PRICE_ITEMS_LIST,"2000");
        clickToElement(ProductPageUI.SAVE_ITEMS);
    }


    public void getAllUploadPicture(List<String> elements,String locatorPicture){
        for (String element:elements) {
            searchElement(element).sendKeys(locatorPicture);
        }
    }


    public int randomNum(){
        Random rand = new Random();
        int random = rand.nextInt(1000);
        return random;
    }

    public void waitInTime(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
