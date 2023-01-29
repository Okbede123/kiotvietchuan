package org.example.InterfaceUI;

public class SaleOrderPageUI {

    public static final String TEXTBOX_NAME_ORDERS = "xpath=//input[@placeholder = 'Tìm hàng hóa']";

    public static final String CODE_ITEMS = "xpath=//div/span[text() = '%s']//parent::div//preceding-sibling::div//parent::div//preceding-sibling::div//parent::li";

    public static final String OFF_POPUP_TOOLTIP = "xpath=//a[@class = 'introjs-skipbutton']";

    public static final String TURN_OP_TOOLTIP_UTILITIES = "xpath=//a[text() = 'Đóng']";

    public static final String INPUT_QUALITY_ITEMS = "xpath=//input[@ng-model = 'item.Quantity']";

    public static final String EDIT_PRICE_ITEMS_ALL = "xpath=//div[@class = 'popup-anchor']/button";

    public static final String EDIT_PRICE_ITEMS = "xpath=//span[text() = 'Giá bán']//parent::label//following-sibling::div/input";

    public static final String EDIT_PRICE_ITEMS_SALEUP = "xpath=//span[text() = 'Giảm giá']//parent::label//following-sibling::div/input";

    public static final String EDIT_PRICE_ITEMS_UNIT_PRICE = "xpath=//span[text() = 'Đơn giá']//parent::label//following-sibling::div/input";

    public static final String INPUT_NOTE_BILL = "xpath=//textarea[contains(@placeholder,'Ghi chú đơn hàng')]";

    public static final String SEARCH_CUSTOMER = "xpath=//input[@placeholder = 'Tìm khách hàng']";

    public static final String CHOOSE_PRICE_LIST = "xpath=(//span[text() = 'Bảng giá chung'])[3]";

    public static final String CHOOSE_PRICE_FROM_LIST = "xpath=(//span[text() = 'giá buôn'])[3]";

    public static final String CLICK_CUSTOMER = "xpath=//li[@val ='%s']";

    public static final String INPUT_LOCATOR_INFORMATION = "xpath=//input[@placeholder = '%s']";

    public static final String INPUT_WEIGHT_ITEMS = "xpath=//input[@id = 'weight']";

    public static final String INPUT_LONG_ITEMS = "xpath=//input[@placeholder = 'Dài']";

    public static final String INPUT_WIDE_ITEMS = "xpath=//input[@placeholder = 'Rộng']";

    public static final String INPUT_HIGH_ITEMS = "xpath=//input[@placeholder = 'Cao']";

    public static final String CHOOSE_WEIGHT_ITEMS_LIST = "xpath=//span[@aria-owns = 'selectWeightUnit_listbox']";

    public static final String CHOOSE_WEIGHT_ITEMS = "xpath=//li[text() ='%s']";

    public static final String NOTE_BILL_SHIP = "xpath=//textarea[@placeholder = 'Ghi chú giao hàng']";

    public static final String CUSTOMER_PAY = "xpath=//div[text() = 'Khách thanh toán ']//parent::div//following-sibling::div/div/input";

    public static final String CHOOSE_SHIPPER_CARRIES = "xpath=//div[contains(text(),'Chuyển phát thường')]";

    public static final String CHECK_BOX_PRICE_DECLARATION ="xpath=//input[@value ='GBH']//parent::label";

    public static final String CHECK_BOX_PRICE_DECLARATION_VERIFY = "xpath=//input[@value ='GBH']";

    public static final String CHECK_BOX_PRICE_SENT_AT_THE_POST_OFFICE ="xpath=//input[@value ='GNG']//parent::label";

    public static final String RADIO_BOX_PAID_RECIPIENTS = "xpath=//span[text() ='Người nhận trả phí']//parent::div";

    public static final String RADIO_BOX_PAID_RECIPIENTS_VERIFY = "xpath=//span[text() ='Người nhận trả phí']//parent::div/input";

    public static final String COLLECT_MONEY_TO_SEE_ITEM = "xpath=//input[@value ='XMG']//parent::label";

    public static final String COLLECT_MONEY_TO_SEE_ITEM_VERIFY_CHECKBOX = "xpath=//input[@value ='XMG']//parent::label/input";

    public static final String CHECK_ITEMS = "xpath=//span[text() ='Không cho xem hàng']";

    public static final String TRY_ITEMS = "xpath=//a[contains(text(),'Cho thử hàng')]";

    public static final String TRY_ITEMS_VERIFY = "xpath=//span[text() ='Cho thử hàng']";

    public static final String RADIO_CHECKBOX_SHIPPER_CARRIES = "xpath=//div[contains(text(),'Chuyển phát thường')]//parent::td//preceding-sibling::td//label/input[@type='radio']";
}
