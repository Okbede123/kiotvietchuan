package org.example.actions.PageObject;


import org.example.cores.Commons.BasePage;
import org.example.InterfaceUI.TikTokPageUI;
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

        if(isDisplayElement(TikTokPageUI.CLICK_TO_ASIAN_SELLER_VIETNAMESE)){
            clickToElement(TikTokPageUI.CLICK_TO_ASIAN_SELLER_VIETNAMESE);
            clickToElementsStringFormat(TikTokPageUI.CHOOSE_LOCATION_SELLER_ASIAN,"Việt Nam");
            clickToElement(TikTokPageUI.CLICK_TO_NEXT_FIREFOX);
        } else if (isDisplayElement(TikTokPageUI.CLICK_TO_ASIAN_SELLER_ENGLISH)) {
            clickToElement(TikTokPageUI.CLICK_TO_ASIAN_SELLER_ENGLISH);
            clickToElementsStringFormat(TikTokPageUI.CHOOSE_LOCATION_SELLER_ASIAN,"Vietnam");
            clickToElement(TikTokPageUI.CLICK_TO_NEXT_CHROME);
        }
    }

    public TikTokLoginPageObject clicktoLoginTikTokSeller(){
        if(isDisplayElement(TikTokPageUI.LOGIN_TIKTOKSELLER_VIETNAM)){
            clickToElement(TikTokPageUI.LOGIN_TIKTOKSELLER_VIETNAM);
        } else if (isDisplayElement(TikTokPageUI.LOGIN_TIKTOKSELLER_ENGLISH)) {
            clickToElement(TikTokPageUI.LOGIN_TIKTOKSELLER_ENGLISH);
        }

        return PageGeneralManager.openLoginTikTokSeller(driver);
    }
}
