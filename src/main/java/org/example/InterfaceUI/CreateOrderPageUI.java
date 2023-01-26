package org.example.InterfaceUI;

public class CreateOrderPageUI {

    public static final String CREATE_ORDERS = "xpath=//a/span[text() = 'Đặt hàng']";

    public static final String CODE_BILLS = "xpath=//span[text() = '%s']";

    public static final String INPUT_CONTACTNUMBER = "xpath=//label[text() = 'Điện thoại:']//parent::div//div/input";

    public static final String INPUT_LOCATOR = "xpath=//input[@placeholder = 'Chọn Tỉnh/TP - Quận/Huyện']";

    public static final String LOCATOR_CHOOSE_LIST = "xpath=//li[@val = '%s']";

    public static final String SERVICE_SHIP = "xpath=//label[text() = 'Dịch vụ:']//parent::div/div/span/span";

    public static final String CHOOSE_SERVICE_SHIP = "xpath=//li[text() = '%s']";

    public static final String MAPPING_ITEMS = "xpath=//aside/a/i[@class = 'fas fa-sync-alt']";
}