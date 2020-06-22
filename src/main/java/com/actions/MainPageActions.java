package com.actions;

import com.pages.Pages;

public class MainPageActions {

    public void search (String searchRequest) {
        Pages.mainPage().loadPage();
        Pages.mainPage().search(searchRequest);
        Pages.mainPage().setFilter();
    }
}
