package org.example.actions.PageObject;


import org.example.cores.Commons.BasePage;
import org.example.cores.Commons.GlobalConstant;
import org.example.InterfaceUI.HomePageUI;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {
    WebDriver driver;
    public HomePageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickToLogin(){
        clickToElement(HomePageUI.LOGIN_HOME_LOCATOR);
    }

    public void inPutNameStore(){
        sendKey(HomePageUI.INPUT_NAME_STORE_LOCATOR, GlobalConstant.NAME_STORE);
    }

    public void getURl(){
        openUrl(GlobalConstant.LINK_URL);
        openFullScreen();
    }

    public LoginPageObject clickToStore(){
        clickToElement(HomePageUI.GO_TO_STORE);
        return new PageGeneralManager().openLoginPage(driver);
    }


}
