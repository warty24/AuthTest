package com.pages;

import com.core.allure.AllureLogger;

public class Pages extends AllureLogger {
    private static LoginPage loginPage;
    private static MainPage mainPage;


    public static LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public static MainPage mainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }
}
