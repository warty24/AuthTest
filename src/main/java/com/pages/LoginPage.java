package com.pages;

import com.core.base.PageTools;
import com.core.utils.Constants;
import org.openqa.selenium.By;

public class LoginPage  extends PageTools {

    private By mailField = By.xpath("//input[@name=\"email\"]");
    private By pswdField = By.xpath("//input[@name=\"password\"]");
    private By invalidPswdMsg = By.xpath("//div [@class =\"auth0-global-message auth0-global-message-error\"]");

    public void enterUserName() {
        type(Constants.USERNAME,mailField);
    }
    public void enterPassword() {
        type(Constants.PASSWORD,pswdField);
    }
    public void enterInvalidUserName() {
        type("mail"+ randomNumber(1000)+"@mail.test",mailField);
    }
    public void enterInvalidPassword() {
        type("Not today",pswdField);
    }
    public void submit () {
        clickEnterButton();
    }
    public boolean isContainsErrMsg () {
        if(!isElementExists(invalidPswdMsg)) waitASec();
        return (getElementText(invalidPswdMsg).contains("WRONG EMAIL OR PASSWORD."));
    }

}
