package com;

import com.actions.Actions;
import com.core.base.BaseTest;
import com.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AuthorisationTest extends BaseTest {

    @Test
    public void authorisationTest() {
        Actions.loginPageActions().logIn(Pages.loginPage().getMail(),"NotToday");
        Assert.assertTrue(Pages.loginPage().isContainsErrMsg());
    }
    @Test
    public void blankAuthorisationTest() {
        Actions.loginPageActions().logIn("","");
        Assert.assertTrue(Pages.loginPage().isContainsBlankFieldErr());
    }

}
