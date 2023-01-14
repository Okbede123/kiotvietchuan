package org.example.actions.PageObject;


import org.example.cores.Commons.BasePage;
import org.example.InterfaceUI.TikTokPageUI;
import org.example.cores.Commons.BaseTest;
import org.openqa.selenium.WebDriver;

public class TikTokPageObject extends BasePage {

    WebDriver driver;

    public TikTokPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public boolean isPageTikTok(){
        return isDisplayElement(TikTokPageUI.VERIFY_TIKTOK_PAGE);
    }

    public void clickToSellerAsian(){
        switchToWindowTabs(TikTokPageUI.TIKTOKSELLER_TITLE);
        if(BaseTest.getNameBrowser().equals("firefox")){
            clickToElement(TikTokPageUI.CLICK_TO_ASIAN_SELLER_FIREFOX);
            clickToElements(TikTokPageUI.CHOOSE_LOCATION_SELLER_ASIAN,"Việt Nam");
            clickToElement(TikTokPageUI.CLICK_TO_NEXT_FIREFOX);
        }
        else {
            clickToElement(TikTokPageUI.CLICK_TO_ASIAN_SELLER_CHROME);
            clickToElements(TikTokPageUI.CHOOSE_LOCATION_SELLER_ASIAN,"Vietnam");
            clickToElement(TikTokPageUI.CLICK_TO_NEXT_CHROME);
        }

    }

    public TikTokLoginPageObject clicktoLoginTikTokSeller(){
        if(BaseTest.getNameBrowser().equals("firefox")){
            waitElementClicks(TikTokPageUI.LOGIN_TIKTOKSELLER_FIREFOX);
            clickToElement(TikTokPageUI.LOGIN_TIKTOKSELLER_FIREFOX);
        }
        else {
            waitElementClicks(TikTokPageUI.LOGIN_TIKTOKSELLER_CHROME);
            clickToElement(TikTokPageUI.LOGIN_TIKTOKSELLER_CHROME);
        }


        return PageGeneralManager.openLoginTikTokSeller(driver);
    }
}
