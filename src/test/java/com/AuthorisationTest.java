package com;

import com.actions.Actions;
import com.core.base.BaseTest;
import com.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AuthorisationTest extends BaseTest {
    @Test
    public void authorisationTest() {
        Actions.loginPageActions().logIn();
        Pages.mainPage().clickUserMenu();
        Assert.assertTrue(Pages.mainPage().isPageContainsLogOutButton());
    }
}
