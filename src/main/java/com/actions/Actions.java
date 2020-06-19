package com.actions;


public class Actions {
    private static MainPageActions mainPageActions;
    private static SearchPageActions searchPageActions;

    public static MainPageActions mainPageActions() {
        if (mainPageActions == null) {
            mainPageActions = new MainPageActions();
        }
        return mainPageActions;
    }
    public static SearchPageActions searchPageActions() {
        if (searchPageActions == null) {
            searchPageActions= new SearchPageActions();
        }
        return searchPageActions;
    }
}
