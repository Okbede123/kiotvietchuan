package org.example.InterfaceUI;

public class CustomerPageUI {

    public static final String CREATE_CUSTOMER = "xpath=//a[@title = 'Khách hàng']";

    public static final String INPUT_NAME_CUSTOMER = "xpath=//input[contains(@ng-model,'customer.Name')]";

    public static final String INPUT_CONTACT_NUMBER = "xpath=//input[contains(@ng-model,'ContactNumber')]";

    public static final String DAYORBIRTH = "xpath=//input[contains(@k-ng-model,'BirthDate')]";

    public static final String INPUT_LOCATOR_CUSTOMER = "xpath=(//input[@placeholder = 'Chọn Tỉnh/TP - Quận/Huyện'])[1]";

    public static final String INPUT_LOCATOR_CUSTOMER_WARD = "xpath=(//input[@placeholder = 'Chọn Phường/Xã'])[1]";

    public static final String CHOOSE_LOCATOR = "xpath=//span[contains(text(),'%s')]";

    public static final String CHOOSE_SEX = "xpath=//div[@class = 'radio-custom has-pretty-child']/div/label[text() = '%s']";

    public static final String SAVE_CUSTOMER = "xpath=(//a[text() = 'Lưu (F9)'])[1]";

    public static final String DELETE_CUSTOMER = "xpath=//a[text() = ' Xóa']";

    public static final String HANDLEPICTUREUPLOAD = "xpath=//img[@ng-show = 'customer.Avatar']";

    public static final String ACCPECT_DELETECUSTOMER = "xpath=//button[text() = 'Đồng ý']";
}
