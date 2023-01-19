package org.example.cores.Commons;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BasePage extends BasePageDefault {

    WebDriver driver;

    public BasePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void openFullScreen(){
        driver.manage().window().maximize();
    }

    @Override
    public void clickToElement(String locator) {
        waitElementClick(locator);
        searchElement(locator).click();
    }



    @Override
   public void sendKey(String locator, String value) {
        waitElementVisibility(locator);
        WebElement element = searchElement(locator);
        element.clear();
        element.sendKeys(value);
    }

    public void sendKeyUpload(String locator, String value) {
        WebElement element = searchElement(locator);
        element.sendKeys(value);

    }

    @Override
    public WebElement searchElement(String locator) {
       return driver.findElement(getByLocator(locator));
    }

    public String castString(String locator,String value){
        return locator = String.format(locator,value);
    }

    public void clickStringFormat(String locator,String value){
        clickToElement(castString(locator,value));
    }

    public void sendKeyStringFormat(String locator,String value,String valueSendkey){
        sendKey(castString(locator,value),valueSendkey);
    }

    public void selectDropDown(String locator,String valueString,String value){
        new Select(searchElement(castString(locator,valueString))).selectByVisibleText(value);
    }




    @Override
    public void openUrl(String locator) {
        driver.get(locator);
    }


    @Override
    public By getByLocator(String locator) {

        By locatorcut = null;

        if(locator.startsWith("ID=") || locator.startsWith("Id=") || locator.startsWith("iD=") || locator.startsWith("id=")){
            //return By.id(locator.substring(3));
            locatorcut = By.id(locator.substring(3));
        }
        else if(locator.startsWith("name=") || locator.startsWith("Name=") || locator.startsWith("NAME=")){
            locatorcut = By.name(locator.substring(5));
        }
        else if(locator.startsWith("xpath=") || locator.startsWith("XPATH=") || locator.startsWith("Xpath=")){
            locatorcut = By.xpath(locator.substring(6));
        }
        else if(locator.startsWith("CSS=") || locator.startsWith("Css=") || locator.startsWith("css=")){
            locatorcut = By.cssSelector(locator.substring(4));
        }
        else if(locator.startsWith("class=") || locator.startsWith("CLASS=") || locator.startsWith("Class=")){
            locatorcut = By.className(locator.substring(6));
        }
        else {
            throw new RuntimeException("Locator is not valild");
        }
        return locatorcut;

    }

    @Override
    public void waitElementVisibility(String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(getByLocator(locator)));
    }

    @Override
    public void waitElementInvisibility(String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.invisibilityOfElementLocated(getByLocator(locator)));
    }

    public boolean isDisplayElement(String locator){
        waitElementVisibility(locator);
        return searchElement(locator).isDisplayed();
    }


    public boolean isSelectElement(String locator){
        return searchElement(locator).isSelected();
    }

    public List<WebElement> searchElements(String locator) {
        return driver.findElements(getByLocator(locator));
    }

    @Override
    public void waitElementClick(String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(getByLocator(locator)));
    }

    public void waitElementClicks(String locator,String ...values) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(getByLocator(castRestParameter(locator,values))));
    }


    public void switchToIframe(String locator){
        driver.switchTo().frame(locator);
    }

    public String getWindowHandle(){
      return driver.getWindowHandle();
    }

    public Set<String> getWindowHandles(){
        return driver.getWindowHandles();
    }

    public WebDriver switchToId(String id){
       return driver.switchTo().window(id);
    }

    public String getTitles(){
        return driver.getTitle();
    }

    public void closeTabs(){
        driver.close();
    }

    public void switchToWindowTabs(String titleexpected){
        Set<String> allId = getWindowHandles();
        System.out.println(allId.size());
        if(allId.size() > 1){
            for (String id :allId) {
                switchToId(id);
                String title = getTitles();
                if(title.equals(titleexpected)){
                    break;
                }
            }
        }
        else {
            sleepintime(1);
            Set<String> allId2 = getWindowHandles();
            for (String id :allId2) {
                switchToId(id);
                String title = getTitles();
                if(title.equals(titleexpected)){
                    System.out.println("test dong 158");
                    break;
                }
            }
        }
    }

    public void sleepintime(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void swithToWinDowTab(){
        String idpresent = getWindowHandle();
        Set<String> allId = getWindowHandles();
        for (String id:allId) {
            if(!id.equals(idpresent)){
                switchToId(id);
            }
        }
    }

    public String castRestParameter(String locator,String...values){
        locator = String.format(locator,(Object[]) values);
        return locator;
    }

    public void clickToElementsStringFormat(String locator, String values){
        searchElement(castRestParameter(locator,values)).click();

    }

    public Set<Cookie> getCookiesLogin(){
        System.out.println(driver.manage().getCookies());
        return driver.manage().getCookies();
    }

    public void addCookieLogin(Set<Cookie> cookies){
        sleepInTime(1);
        for (Cookie cookie:cookies) {
            driver.manage().addCookie(cookie);
        }
        driver.navigate().refresh();
    }

    public void sleepInTime(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
