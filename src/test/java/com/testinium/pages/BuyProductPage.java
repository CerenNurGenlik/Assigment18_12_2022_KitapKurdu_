package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class BuyProductPage {

    Method method;
    Logger logger = LogManager.getLogger(BuyProductPage.class);

    public BuyProductPage(){
        method = new Method();
    }

    public void buyProduct(){

        method.click(By.cssSelector("sprite-cart-icon"));
        method.waitBySeconds(2);
        method.click(By.cssSelector("#js-checkout"));
        method.selectByText(By.xpath("//a[@onclick'setShippigAddressType('new')']"),"Yeni bir adres kullanmak istiyorum.");
        method.sendKeys(By.cssSelector("#address-firstname-companyname"),"Ceren");
        method.sendKeys(By.cssSelector("#address-lastname-title"),"GenlikKara");
        method.sendKeys(By.cssSelector("#address-address-text"),"Maltepe");
        method.click(By.cssSelector("#button-checkout-continue"));

        method.waitBySeconds(3);



    }
}
