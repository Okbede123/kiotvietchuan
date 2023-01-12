package org.example.actions.PageObject;


import org.example.cores.commons.BasePage;
import org.example.cores.commons.GlobalConstant;
import org.example.interfaceUI.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePage {

    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void sendUserNameandPassWord(){
        sendKey(LoginPageUI.NAME_USER_LOCATOR, GlobalConstant.USERNAME_STORE);
        sendKey(LoginPageUI.PASS_USER_LOCATOR,GlobalConstant.PASSWORD_STORE);
    }

    public MyDashBoardPageObject clickToManage(){
        clickToElement(LoginPageUI.GO_TO_MANAGE);
        return new PageGeneralManager().openMyDashBoard(driver);
    }
}
