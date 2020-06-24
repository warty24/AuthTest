package com.pages;

import com.core.base.PageTools;
import com.core.utils.Constants;
import org.openqa.selenium.By;

public class LoginPage  extends PageTools {

    private By mailField = By.xpath("//*[@class=\"auth0-lock-input-block auth0-lock-input-email\"]//input");
    private By pswdField = By.xpath("//*[@class=\"auth0-lock-input-show-password\"]//input");
    private By invalidPswdField = By.xpath("//div [@class =\"auth0-global-message auth0-global-message-error\"]");

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
        if(!isElementExists(invalidPswdField)) waitASec();
        return (getElementText(invalidPswdField).contains("WRONG EMAIL OR PASSWORD."));
    }

}
