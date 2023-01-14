package org.example.actions.PageObject;

import org.example.cores.Commons.BasePage;
import org.example.InterfaceUI.TikTokPageLoginUI;
import org.example.cores.Commons.BaseTest;
import org.openqa.selenium.WebDriver;

public class TikTokLoginPageObject extends BasePage {
    WebDriver driver;
    Object CHROME;
    Object FIREFOX;
    Object EDGE;
    public TikTokLoginPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void loginWithEmail(){
        waitElementClicks(TikTokPageLoginUI.LOGIN_WITH_EMAIL);
        clickToElement(TikTokPageLoginUI.LOGIN_WITH_EMAIL);
    }

    public void sendEmailTextBox(String values){
        if(BaseTest.getNameBrowser().equals("firefox")){
            waitElementVisibility(TikTokPageLoginUI.TEXTBOX_EMAIL_FIREFOX);
            sendKey(TikTokPageLoginUI.TEXTBOX_EMAIL_FIREFOX,values);
        }
        else {
            waitElementVisibility(TikTokPageLoginUI.TEXTBOX_EMAIL_CHROME);
            sendKey(TikTokPageLoginUI.TEXTBOX_EMAIL_CHROME,values);
        }


    }

    public void sendPassTextBox(String values){
        if(BaseTest.getNameBrowser().equals("firefox")){
            waitElementVisibility(TikTokPageLoginUI.TEXTBOX_PASSWORD_FIREFOX);
            sendKey(TikTokPageLoginUI.TEXTBOX_PASSWORD_FIREFOX,values);
        }
        else {
            waitElementVisibility(TikTokPageLoginUI.TEXTBOX_PASSWORD_CHROME);
            sendKey(TikTokPageLoginUI.TEXTBOX_PASSWORD_CHROME,values);
        }


    }

    public void clickLogin(){
        waitElementClicks(TikTokPageLoginUI.BUTTON_LOGIN);
        clickToElement(TikTokPageLoginUI.BUTTON_LOGIN);
    }

}
