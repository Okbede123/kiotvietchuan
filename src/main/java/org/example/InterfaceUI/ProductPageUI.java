package org.example.InterfaceUI;

public class ProductPageUI {

    public static final String CREATE_NEW_ORDER_HEADER = "xpath=//span[text() = '%s']";

    public static final String CREATE_ITEMS = "xpath=//a[text() = ' %s']";

    public static final String INPUT_NAME_ITEM = "xpath=//input[@kv-valid-special-chars = 'Tên hàng']";

    public static final String GROUP_ITEMS = "xpath=(//span[text() = ' ---Lựa chọn---'])[2]";

    public static final String GROUP_ITEMS_SELECT = "xpath=(//select[@k-options = 'categorySelectOptions'])[2]";

    public static final String TRADEMARK = "xpath=//span[text() = '---Chọn thương hiệu---']";

    public static final String TRADEMARK_CHOOSE = "xpath=(//li[text() = 'Hảo hảo'])[2]";

    public static final String CHOOSE_GROUP = "xpath=(//li[@class='k-item ng-scope']/span[text()='%s'])[2]";

    public static final String CREATE_LOCATOR = "xpath=(//div[@class = 'input-group-append'])[2]";

    public static final String INPUT_LOCATOR = "xpath=//label[text() = 'Tên vị trí']//parent::div//following-sibling::div/input";

    public static final String CLICK_CUSTOM_LOCATOR = "xpath=//div/span[text() = 'Thêm mới vị trí']//parent::div//following-sibling::div//div/a[text() = '%s']";

    public static final String UPLOAD_PICTURES = "xpath=//input[@type = 'file']";

    public static final String PROPERTIES_ITEMS = "xpath=//a[text() = '%s']";

    public static final String ADD_NEW_PROPERTIES = "xpath=//button[text() = 'Thêm thuộc tính']";

    public static final String OPEN_DROPDOWN_PROPERTIES = "xpath=//span[text() = 'Chọn thuộc tính...']";

    public static final String PROPERTIES_CHOOSE = "xpath=//li[text() = '%s']";

    public static final String INPUT_VALUE_PROPERTIES = "xpath=//input[@placeholder = 'Nhập giá trị và enter']";

    public static final String NAME_ITEM_UNIT = "xpath=//input[@kv-valid-special-chars = 'Tên đơn vị']";

    public static final String PRICE_COST = "xpath=(//th[text() = 'Giá vốn']//parent::tr//parent::thead//parent::table/tbody/tr/td/input)[3]";

    public static final String INVENTORY = "xpath=(//th[text() = 'Tồn kho']//parent::tr//parent::thead//parent::table/tbody/tr/td/input)[4]";

    public static final String PRICE_ITEMS_LIST = "xpath=(//input[@title = 'Bảng giá chung'])[2]";

    public static final String SAVE_ITEMS = "xpath=(//a[text() = 'Lưu'])[4]";

}
