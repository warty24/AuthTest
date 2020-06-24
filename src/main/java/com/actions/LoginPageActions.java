package com.actions;

import com.pages.Pages;

public class LoginPageActions {
    public void logIn(){
        Pages.loginPage().start();
        Pages.loginPage().enterUserName();
        Pages.loginPage().enterPassword();
        Pages.loginPage().submit();
    }
    public void logInWrongPassword(){
        Pages.loginPage().start();
        Pages.loginPage().enterUserName();
        Pages.loginPage().enterInvalidPassword();
        Pages.loginPage().submit();
    }
}
