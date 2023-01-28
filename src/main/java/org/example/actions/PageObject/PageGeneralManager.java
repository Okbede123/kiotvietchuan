package org.example.actions.PageObject;

import org.openqa.selenium.WebDriver;

public class PageGeneralManager  {


    public static HomePageObject openHomePage(WebDriver driver){
        return new HomePageObject(driver);
    }

    public static LoginPageObject openLoginPage(WebDriver driver){
        return new LoginPageObject(driver);
    }

    public static MyDashBoardPageObject openMyDashBoard(WebDriver driver){
        return new MyDashBoardPageObject(driver);
    }

    public static PosOnlineObject openPosOnline(WebDriver driver){
        return new PosOnlineObject(driver);
    }

    public static TikTokPageObject openTikTokSeller(WebDriver driver){
        return  new TikTokPageObject(driver);
    }

    public static TikTokLoginPageObject openLoginTikTokSeller(WebDriver driver){
        return  new TikTokLoginPageObject(driver);
    }

    public static ProductPageObject openCreateProduct(WebDriver driver){
        return new ProductPageObject(driver);
    }

    public static CreateOrderPageObject openCreateOrderPage(WebDriver driver){
        return new CreateOrderPageObject(driver);
    }

    public static SaleOrderPageObject openSaleOrderPage(WebDriver driver){
        return new SaleOrderPageObject(driver);
    }

    public static CustomerPageObject openCustomerPage(WebDriver driver){
        return new CustomerPageObject(driver);
    }
}
