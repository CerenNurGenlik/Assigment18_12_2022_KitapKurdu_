package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.SearchProductPage;
import org.junit.Test;

public class SearchProductTest extends BaseTest {

    @Test
    public void searchProductTest(){
        SearchProductPage searchProductPage = new SearchProductPage();

        searchProductPage.searchProduct();
    }


}
