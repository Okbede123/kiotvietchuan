package org.example.InterfaceUI;

public class PosOnlineUI {

    public static final String SETTING_POS_LOCATOR = "xpath=//a[@href = '#/setting']";

    public static final String ADD_TIKTOK_SELLER_LOCATOR = "xpath=//button[contains(@class,'tiktok')]";

    public static final String SCREEN_ADD_OMNI_SELLER = "xpath=//div[@class = 'setting-step-block']";

    public static final String SCREEN_CONTAINER_LOCATOR = "xpath=//kv-ol-header/div";

    public static final String SCREEN_CONNECTION_SETTING = "xpath=//kv-ol-connection-setting";

    public static final String HANDLED_FBPOS_LOCATOR = "xpath=//div[@class = 'introjs-tooltipbuttons']/a";

    public static final String HANDLED_SCREEN_FBPOS_LOCATOR = "xpath=//div[@class = 'introjs-tooltipbuttons']//a[@role= 'button']";

    public static final String TITLE_POSONLINE = "POS Online - Tổng quan";

    public static final String TITLE_FBPOSONLINE = "KiotViet-Facebook";

    public static final String LOGIN_TIKTOKSELLER = "xpath=//button[text() = 'Đăng nhập']";

    public static final String SETTING = "xpath=//a[contains(@href, 'setting')]";
    public static final String SETTING_SYNC_BILLS = "xpath=(//span[text() = 'Mã đơn hàng %s']//parent::div//parent::div)[1]//parent::td//preceding-sibling::td//parent::tr//following-sibling::tr[@aria-rowindex = 3]//div[@class = 'd-flex flex-column order-item-detail']//div[@class = 'd-flex flex-wrap']/div//kv-ol-omni-sync-fail-action-cbb";
    public static final String MAPPING_ITEMS = "xpath=//div[text() = 'Liên kết hàng hóa']";
    public static final String CHOOSE_ITEM_TO_MAPPING = "xpath=//input[@placeholder = 'Chọn hàng hóa để liên kết']";
}
