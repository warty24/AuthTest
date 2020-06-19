package com.pages;

import com.core.allure.AllureLogger;

public class Pages extends AllureLogger {
    private static MainPage mainPage;
    private static SearchPage searchPage;

    public static MainPage mainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }
    public static SearchPage searchPage() {
        if (searchPage == null) {
            searchPage = new SearchPage();
        }
        return searchPage;
    }
}
