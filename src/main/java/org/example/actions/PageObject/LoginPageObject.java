package org.example.actions.PageObject;


import org.example.cores.Commons.BasePage;
import org.example.cores.Commons.GlobalConstant;
import org.example.InterfaceUI.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePage {

    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void getToSellerUrl(){
        openFullScreen();
        openUrl(GlobalConstant.LINK_URL_STORE);
    }

    public void sendUserNameandPassWord(){
        sendKey(LoginPageUI.NAME_USER_LOCATOR, GlobalConstant.USERNAME_STORE);
        sendKey(LoginPageUI.PASS_USER_LOCATOR,GlobalConstant.PASSWORD_STORE);
    }

    public MyDashBoardPageObject clickToManage(){
        clickToElement(LoginPageUI.GO_TO_MANAGE);
        return PageGeneralManager.openMyDashBoard(driver);

    }

    public void clickToManageTest(){
        clickToElement(LoginPageUI.GO_TO_MANAGE);
    }
}
