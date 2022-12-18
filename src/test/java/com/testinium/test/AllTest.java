package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.*;
import org.junit.Test;

public class AllTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();

        loginPage.login();
    }


    @Test
    public void searchProductTest(){
        SearchProductPage searchProductPage = new SearchProductPage();

        searchProductPage.searchProduct();
    }

    @Test
    public void selectProductTest(){
        SelectProductPage selectProductPage = new SelectProductPage();

        selectProductPage.selectProduct();
    }


    @Test
    public void deleteProductTest(){


        DeleteProductPage deleteProductPage = new DeleteProductPage();
        deleteProductPage.deleteProduct();
    }


    @Test
    public void buyProductTest(){


        BuyProductPage buyProductPage = new BuyProductPage();
        buyProductPage.buyProduct();
    }


    @Test
    public void logoutTest(){
        LogoutPage logoutPage = new LogoutPage();

        logoutPage.logout();
    }



}
