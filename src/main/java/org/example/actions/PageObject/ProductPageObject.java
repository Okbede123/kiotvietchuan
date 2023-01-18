package org.example.actions.PageObject;

import org.example.cores.Commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ProductPageObject extends BasePage {

    WebDriver driver;

    public ProductPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
