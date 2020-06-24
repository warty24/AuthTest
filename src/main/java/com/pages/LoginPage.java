package com.pages;

import com.core.base.PageTools;
import com.core.utils.Constants;
import org.openqa.selenium.By;

public class LoginPage  extends PageTools {

    private By mailField = By.xpath("//*[@class=\"auth0-lock-input-block auth0-lock-input-email\"]//input");
    private By pswdField = By.xpath("//*[@class=\"auth0-lock-input-show-password\"]//input");


    public void start(){
        openPage(Constants.MAIN_PAGE_URL);

    }
    public void enterLoginData() {
        click(mailField);
        type(Constants.USERNAME,mailField);
        type(Constants.PASSWORD,pswdField);
        clickEnterButton();
    }
}
