package org.example.cores.Commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePageDefault {
    WebDriver driver;

    public BasePageDefault(WebDriver driver){
        this.driver = driver;
    }

    abstract void clickToElement(String locator);
    abstract void sendKey(String locator,String value);
    abstract WebElement searchElement(String locator);

    abstract void openUrl(String locator);

    abstract By getByLocator(String locator);

    abstract void waitElementVisibility(String locator);

    abstract void waitElementInvisibility(String locator);

    abstract void waitElementClick(String locator);
}
