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
}
