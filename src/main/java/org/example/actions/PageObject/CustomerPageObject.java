package org.example.actions.PageObject;

import org.example.InterfaceUI.CustomerPageUI;
import org.example.cores.Commons.GlobalConstant;
import org.openqa.selenium.WebDriver;

public class CustomerPageObject extends HeaderPageObject {

    WebDriver driver;

    public CustomerPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void createCustomer(){
        clickToElement(CustomerPageUI.CREATE_CUSTOMER);
    }

    public void inputInfomationCustomer(String...values){
        int i = 0;
        do{
            sendKey(CustomerPageUI.INPUT_NAME_CUSTOMER,values[i] + randomNum());
            i++;
            sendKey(CustomerPageUI.INPUT_CONTACT_NUMBER,values[i]+ randomNum());
            i++;
            clickStringFormat(CustomerPageUI.CHOOSE_SEX,values[i]);
            i++;
            sendKey(CustomerPageUI.INPUT_LOCATOR_CUSTOMER,values[i]);
            i++;
            clickStringFormat(CustomerPageUI.CHOOSE_LOCATOR,values[i]);
            i++;
            sendKey(CustomerPageUI.INPUT_LOCATOR_CUSTOMER_WARD,values[i]);
            i++;
            clickStringFormat(CustomerPageUI.CHOOSE_LOCATOR,values[i]);
            break;
        }while (values.length < i);
        do{
            sendKeyUpload(GlobalConstant.UPLOAD_PICTURES,GlobalConstant.LINK_PROJECT+ "test.jpg");
        }while (searchElement(CustomerPageUI.HANDLEPICTUREUPLOAD).getAttribute("class").contains("ng-hide"));

        clickToElement(CustomerPageUI.SAVE_CUSTOMER);
        clickToElement(CustomerPageUI.DELETE_CUSTOMER);
        clickToElement(CustomerPageUI.ACCPECT_DELETECUSTOMER);

    }

//    public void sendKeyAndClick(String locator1,String locator2){
//        sendKey(CustomerPageUI.INPUT_LOCATOR_CUSTOMER,locator1);
//        clickStringFormat(CustomerPageUI.CHOOSE_LOCATOR,locator2);
//    }
}
