package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class SearchProductPage {

    Method method;

    Logger logger = LogManager.getLogger(SearchProductPage.class);

    public SearchProductPage(){
        method = new Method();
    }

    public void searchProduct(){
        method.sendKeys(By.xpath("//input[@id='search-input']"),"oyuncak");
        method.click(By.cssSelector(".common-sprite.button-search"));
        method.waitBySeconds(3);
        if(method.isElementVisible(By.xpath("(//div[@class='product-list']/div[@class='product-cr'])[7]")))
            method.scrollWithAction(By.xpath("(//div[@class='product-list']/div[@class='product-cr'])[7]"));
        method.waitBySeconds(3);
        String favNo = method.favoriteAdd(By.xpath("(//div[@class='product-list']/div[@class='product-cr'])[3]/div[2]/div[3]/a[4]"),"onclick");
        logger.info(favNo);
        method.waitBySeconds(10);


        method.findElement(By.cssSelector(".product-list>.product-cr:nth-child(2)>.grid_2.alpha.omega.relative>.hover-menu>.add-to-favorites")).click();
        method.waitBySeconds(2);
        method.findElement(By.cssSelector(".product-list>.product-cr:nth-child(3)>.grid_2.alpha.omega.relative>.hover-menu>.add-to-favorites")).click();
        method.waitBySeconds(2);
        method.findElement(By.cssSelector(".product-list>.product-cr:nth-child(4)>.grid_2.alpha.omega.relative>.hover-menu>.add-to-favorites")).click();
        method.waitBySeconds(2);
        method.findElement(By.cssSelector(".product-list>.product-cr:nth-child(5)>.grid_2.alpha.omega.relative>.hover-menu>.add-to-favorites")).click();
        method.waitBySeconds(2);

        method.click(By.cssSelector(".logo-text"));
        method.waitBySeconds(3);

    }



}
