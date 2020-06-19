package com.pages;

import com.core.allure.AllureLogger;

public class Pages extends AllureLogger {
    private static MainPage mainPage;
    private static SearchPage searchPage;
    private static ProductPage productPage;

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
    public static ProductPage productPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;
    }
}
