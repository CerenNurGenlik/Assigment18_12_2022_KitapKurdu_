package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.DeleteProductPage;
import org.junit.Test;

public class DeleteProductTest extends BaseTest {

    @Test
    public void deleteProductTest(){


        DeleteProductPage deleteProductPage = new DeleteProductPage();
        deleteProductPage.deleteProduct();
    }


}
