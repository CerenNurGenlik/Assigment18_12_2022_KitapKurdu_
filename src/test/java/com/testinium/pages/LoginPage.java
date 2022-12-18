package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Method method;

    Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage(){
        method = new Method();
    }

    public void login(){
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

    }
}
