package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;




public class SelectProductPage {

    Method method;
    Logger logger = LogManager.getLogger(SelectProductPage.class);

    public SelectProductPage(){
        method = new Method();
    }


    public void selectProduct(){
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
        method.click(By.cssSelector(".sprite__product.icon__cta-score"));
        method.waitBySeconds(2);






    }



}
