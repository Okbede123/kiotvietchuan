package org.example.actions.PageObject;


import org.example.cores.commons.BasePage;
import org.example.interfaceUI.PosOnlineUI;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class PosOnlineObject extends BasePage {
    WebDriver driver;

    public PosOnlineObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public boolean isPosOnlinePageObject(){
        return isDisplayElement(PosOnlineUI.SCREEN_CONTAINER_LOCATOR);
    }

    public void clickToSetting(){
        clickToElement(PosOnlineUI.SETTING_POS_LOCATOR);
    }

    public void clickAddTikTokSeller(){
        clickToElement(PosOnlineUI.ADD_TIKTOK_SELLER_LOCATOR);
    }

    public boolean isDisplayAddOmniChannel(){
        return isDisplayElement(PosOnlineUI.SCREEN_ADD_OMNI_SELLER);
    }

    public boolean isDisplayConnectionSetting(){
        return isDisplayElement(PosOnlineUI.SCREEN_CONNECTION_SETTING);
    }

    public void checkFBPosDisplay(){
        String idwindowpresent = getWindowHandle();
        clickToElement(PosOnlineUI.HANDLED_FBPOS_LOCATOR);
        Set<String> allWindowHandles = getWindowHandles();
        for (String id: allWindowHandles) {
            switchToId(id);
            String titleId = getTitles();
            if(titleId.contains(PosOnlineUI.TITLE_FBPOSONLINE)){
                closeTabs();
                switchToId(idwindowpresent);
                break;
            }
        }
    }
    public TikTokPageObject clickToLoginOmniChannel(){
        waitElementClick(PosOnlineUI.LOGIN_TIKTOKSELLER);
        clickToElement(PosOnlineUI.LOGIN_TIKTOKSELLER);
        return PageGeneralManager.openTikTokSeller(driver);
    }
}
