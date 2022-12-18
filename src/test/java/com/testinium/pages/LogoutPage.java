package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LogoutPage {

    Method method;

    Logger logger = LogManager.getLogger(LogoutPage.class);

    public LogoutPage(){
        method = new Method();
    }

    public void logout(){


        method.mouseHover(By.cssSelector(".common-sprite>b"));
        method.waitBySeconds(2);
        method.click(By.xpath("//a[text()='Çıkış']"));
        method.waitBySeconds(2);
    }

}
