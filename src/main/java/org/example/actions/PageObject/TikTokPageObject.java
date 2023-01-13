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
        clickToElement(TikTokPageUI.CLICK_TO_ASIAN_SELLER);
        clickToElements(TikTokPageUI.CHOOSE_LOCATION_SELLER_ASIAN,"Vietnam");
        clickToElement(TikTokPageUI.CLICK_TO_NEXT);
    }

    public TikTokLoginPageObject clicktoLoginTikTokSeller(){
        waitElementClicks(TikTokPageUI.LOGIN_TIKTOKSELLER);
        clickToElement(TikTokPageUI.LOGIN_TIKTOKSELLER);
        return new PageGeneralManager().openLoginTikTokSeller(driver);
    }
}
