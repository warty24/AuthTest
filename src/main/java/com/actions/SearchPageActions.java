package com.actions;

import com.pages.Pages;

public class SearchPageActions {

    public void collectRresults() {
        Pages.searchPage().findResults();
        Pages.searchPage().parseResults();
    }
}
