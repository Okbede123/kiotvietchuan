package org.example.actions.PageObject;


import org.example.cores.Commons.BasePage;
import org.example.InterfaceUI.PosOnlineUI;
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

    public void clickToMappingItems(String value){
        clickStringFormat(PosOnlineUI.SETTING_SYNC_BILLS,value);
        clickToElement(PosOnlineUI.MAPPING_ITEMS);
        switchToWindowTabsById();
        sendKey(PosOnlineUI.CHOOSE_ITEM_TO_MAPPING,"okbede");
    }
}
