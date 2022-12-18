package com.testinium.methods;

import com.testinium.driver.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Method {

    WebDriver driver;
    FluentWait<WebDriver> wait;

    //JavascriptExecutor jsdriver;

    Logger logger = LogManager.getLogger(Method.class);


    public Method(){

        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);

        //jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by){

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public String favoriteAdd(By by, String attribute){
        String attiributeFav = findElement(by).getAttribute(attribute);
        logger.info("alınan text:"+attiributeFav);
        return (attiributeFav.substring(15,21));
    }

    public void click(By by){
        findElement(by).click();
    }

    public void waitBySeconds(long seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }

    public boolean isElementVisible(By by){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            logger.info("true");
            return true;
        }catch (Exception e){
            logger.info("false" + e.getMessage());
            return false;
        }
    }


    public void scrollWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    /*public void scrollWithJavaS(By by){
        jsdriver.executeScript("arguments[0].scrollIntoView()",findElement(by));
    }*/

    public Select getSelect(By by){
        return new Select(findElement(by));
    }

    public void selectByText(By by, String text){

        getSelect(by).selectByVisibleText(text);
    }

    public String getAttiributs(By by, String attiributeName){
        return findElement(by).getAttribute(attiributeName);
    }

    public String getText(By by){
        return findElement(by).getText();
    }

    /*public String getValue(By by){
        return jsdriver.executeScript("return arguments[0].value;",findElement(by)).toString();
    }*/

    public void mouseHover(By by){
        WebElement hover = driver.findElement(by);
        Actions action = new Actions(driver);
        action.moveToElement(hover).perform();
    }

    public void selectRandomProduct(By by){

        // Find and click on a random product
        List<WebElement> allProducts = driver.findElements(By.cssSelector(".grid_9"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
    }

}
