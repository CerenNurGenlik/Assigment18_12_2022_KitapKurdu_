package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.BuyProductPage;
import com.testinium.pages.DeleteProductPage;
import org.junit.Test;

public class BuyProductTest extends BaseTest {

    @Test
    public void buyProductTest(){


        BuyProductPage buyProductPage = new BuyProductPage();
        buyProductPage.buyProduct();
    }
}
