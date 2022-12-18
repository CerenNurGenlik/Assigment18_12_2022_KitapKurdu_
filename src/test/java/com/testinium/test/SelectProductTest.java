package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.SelectProductPage;
import org.junit.Test;

public class SelectProductTest extends BaseTest {

    @Test
    public void selectProductTest(){
        SelectProductPage selectProductPage = new SelectProductPage();

        selectProductPage.selectProduct();
    }


}
