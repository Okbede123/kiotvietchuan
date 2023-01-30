package org.example.actions.PageObject;

import org.example.InterfaceUI.ProductPageUI;
import org.example.cores.Commons.GlobalConstant;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ProductPageObject extends HeaderPageObject {

    WebDriver driver;

    public static String getNameItem;

    public ProductPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickToCreateHeader(){
        clickStringFormat(ProductPageUI.CREATE_NEW_ORDER_HEADER,"Thêm mới");
        clickStringFormat(ProductPageUI.CREATE_ITEMS,"Thêm hàng hóa");
    }

    public void inputInformationItem(){
        int tempNameItem;
        tempNameItem = randomNum();
        clickToElement(ProductPageUI.GROUP_ITEMS);
        clickStringFormat(ProductPageUI.CHOOSE_GROUP,"áo phao");
        clickToElement(ProductPageUI.TRADEMARK);
        clickStringFormat(ProductPageUI.TRADEMARK_CHOOSE,"Hảo Hảo");
        clickToElement(ProductPageUI.CREATE_LOCATOR);
        sendKey(ProductPageUI.INPUT_LOCATOR,"hạ long" + randomNum());
        clickStringFormat(ProductPageUI.CLICK_CUSTOM_LOCATOR,"Lưu");
        sendKeyUpload(GlobalConstant.UPLOAD_PICTURES, GlobalConstant.LINK_PROJECT+"unnamed.jpg" + "\n" + GlobalConstant.LINK_PROJECT+ "test.jpg" + "\n" + GlobalConstant.LINK_PROJECT+"ĐỨC THẦN TÀI.png");
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
        sendKey(ProductPageUI.INPUT_NAME_ITEM,"vietnam" + tempNameItem);
        getNameItem = "vietnam" + tempNameItem;
        clickToElement(ProductPageUI.SAVE_ITEMS);
        waitElementVisibility(ProductPageUI.VERIFY_ITEM_CREATE_SUCCESSFUL);
    }


    public void getAllUploadPicture(List<String> elements,String locatorPicture){
        for (String element:elements) {
            searchElement(element).sendKeys(locatorPicture);
        }
    }

    public void searchNameItems(String value){
        sendKey(ProductPageUI.FIND_NAME_ITEMS,value);
        searchElement(ProductPageUI.FIND_NAME_ITEMS).sendKeys(Keys.ENTER);
    }

    public void mappingTikTokShop(){
        clickToElement(ProductPageUI.MAPPING_ITEMS);
        clickToElement(ProductPageUI.CLICK_TO_MAPPING_TIKTOKSHOP);
        clickByJsStringFormat(ProductPageUI.MAPPING_TIKTOK,"An95 Store","7494627850020292845");
        sendKeyStringFormat(ProductPageUI.INPUT_NAME_ITEM_OMMNI,"giấy","An95 Store","7494627850020292845");
        clickByJsStringFormat(ProductPageUI.CHOOSE_ITEM_TIKTOK,"Gấu Trúc");
        clickByJsStringFormat(ProductPageUI.DELETE_MAPPING_OMMNI,"An95 Store","7494627850020292845");
    }

    public String verifyNameItemMapping(){
        return searchElementStringFormat(ProductPageUI.VERIFY_ITEM_MAPPING_OMNI,"Giấy Ăn Gấu Trúc Thùng 30 Gói (Hàng Việt Nam) - loại 1 - vàng").getText();
    }

}
