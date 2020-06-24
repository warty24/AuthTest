package com.actions;

import com.pages.Pages;

public class LoginPageActions {
    public void logIn(){
        Pages.loginPage().start();
        Pages.loginPage().enterLoginData();
    }
}
