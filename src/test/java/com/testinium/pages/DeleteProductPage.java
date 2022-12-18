package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DeleteProductPage {

    Method method;
    Logger logger = LogManager.getLogger(DeleteProductPage.class);

    public DeleteProductPage(){
        method = new Method();
    }

    public void deleteProduct(){

        method.mouseHover(By.xpath("//a[contains(@class,'common-sprite')][contains(text(),'Listelerim')]"));
        method.waitBySeconds(2);
        method.click(By.xpath("//a[text()='Favorilerim']"));
        method.waitBySeconds(2);





    }
}
