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

    public static final String CREATE_LOCATOR = "xpath=(//div[@class = 'input-group-append']/a/i[@class = 'far fa-plus'])[2]";

    public static final String INPUT_LOCATOR = "xpath=//label[text() = 'Tên vị trí']//parent::div//following-sibling::div/input";

    public static final String CLICK_CUSTOM_LOCATOR = "xpath=//div/span[text() = 'Thêm mới vị trí']//parent::div//following-sibling::div//div/a[text() = '%s']";

    public static final String UPLOAD_PICTURES = "xpath=//input[@type = 'file']";

}
