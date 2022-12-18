package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.LoginPage;
import com.testinium.pages.LogoutPage;
import org.junit.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest(){
        LogoutPage logoutPage = new LogoutPage();

        logoutPage.logout();
    }
}
