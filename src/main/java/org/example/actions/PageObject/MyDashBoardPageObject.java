package org.example.actions.PageObject;


import org.example.cores.commons.BasePage;
import org.example.interfaceUI.MyDashBoardUI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class MyDashBoardPageObject extends BasePage {

    WebDriver driver;

    public MyDashBoardPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public boolean verifyToDashBoard(){
        boolean status;
        try {
            Assert.assertTrue(isDisplayElement(MyDashBoardUI.MY_DASHBOARD_VERIFY));
            status = true;
        }catch (Throwable e){
            status = false;
            System.out.println(e);
        }
        return status;
    }

    public PosOnlineObject clickToSellerOnline(){
        clickToElement(MyDashBoardUI.SELLER_ONLINE_LOCATOR);
        return PageGeneralManager.openPosOnline(driver);
    }

}
