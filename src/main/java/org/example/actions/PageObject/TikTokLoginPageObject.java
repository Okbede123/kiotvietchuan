package org.example.actions.PageObject;

import org.example.cores.commons.BasePage;
import org.example.interfaceUI.TikTokPageLoginUI;
import org.openqa.selenium.WebDriver;

public class TikTokLoginPageObject extends BasePage {
    WebDriver driver;
    public TikTokLoginPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void loginWithEmail(){
        waitElementClicks(TikTokPageLoginUI.LOGIN_WITH_EMAIL);
        clickToElement(TikTokPageLoginUI.LOGIN_WITH_EMAIL);
    }

    public void sendEmailTextBox(String values){
        waitElementVisibility(TikTokPageLoginUI.TEXTBOX_EMAIL);
        sendKey(TikTokPageLoginUI.TEXTBOX_EMAIL,values);
    }

    public void sendPassTextBox(String values){
        waitElementVisibility(TikTokPageLoginUI.TEXTBOX_PASSWORD);
        sendKey(TikTokPageLoginUI.TEXTBOX_PASSWORD,values);
    }

    public void clickLogin(){
        waitElementClicks(TikTokPageLoginUI.BUTTON_LOGIN);
        clickToElement(TikTokPageLoginUI.BUTTON_LOGIN);
    }

}
