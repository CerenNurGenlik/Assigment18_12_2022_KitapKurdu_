package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AllPage {

    Method method;

    Logger logger = LogManager.getLogger(AllPage.class);

    public AllPage(){
        method = new Method();
    }

    public void allPage(){
        method.click(By.cssSelector(".menu-top-button.login>a"));
        //method.waitBySeconds(5);
        method.sendKeys(By.cssSelector("#login-email"),"cerengenlik318@gmail.com");
        //method.waitBySeconds(3);
        method.sendKeys(By.xpath("//input[@id='login-password']"),"Cerenkara1");
        //method.waitBySeconds(3);
        method.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        //method.waitBySeconds(10);
        Assert.assertTrue(method.isElementVisible(By.cssSelector(".common-sprite>b")));
        logger.info("b");
        method.waitBySeconds(3);



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



        method.click(By.cssSelector(".lvl1catalog"));
        method.waitBySeconds(2);

        method.click(By.xpath("(//div[@class='landing-block']/a/img)[2]"));
        method.waitBySeconds(2);

        method.selectByText(By.cssSelector(".sort>select"),"Yüksek Oylama");
        method.waitBySeconds(2);

        method.mouseHover(By.xpath("//span[contains(@class,'mn-strong common-sprite')][contains(text(),'Tüm Kitaplar')]"));
        method.waitBySeconds(2);
        method.click(By.xpath("//a[contains(@class,'mn-icon icon-angleRight')][contains(text(),'Hobi')]"));
        method.waitBySeconds(2);

        method.selectRandomProduct(By.cssSelector(".grid_9"));
        method.waitBySeconds(2);



        method.mouseHover(By.xpath("//a[contains(@class,'common-sprite')][contains(text(),'Listelerim')]"));
        method.waitBySeconds(2);
        method.click(By.xpath("//a[text()='Favorilerim']"));
        method.waitBySeconds(2);



        method.click(By.cssSelector("sprite-cart-icon"));
        method.waitBySeconds(2);
        method.click(By.cssSelector("#js-checkout"));
        method.selectByText(By.xpath("//a[@onclick'setShippigAddressType('new')']"),"Yeni bir adres kullanmak istiyorum.");
        method.sendKeys(By.cssSelector("#address-firstname-companyname"),"Ceren");
        method.sendKeys(By.cssSelector("#address-lastname-title"),"GenlikKara");
        method.sendKeys(By.cssSelector("#address-address-text"),"Maltepe");
        method.click(By.cssSelector("#button-checkout-continue"));

        method.waitBySeconds(3);



        method.mouseHover(By.cssSelector(".common-sprite>b"));
        method.waitBySeconds(2);
        method.click(By.xpath("//a[text()='Çıkış']"));
        method.waitBySeconds(2);

    }
}
