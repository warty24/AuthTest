package com.pages;

import com.core.base.PageTools;
import org.openqa.selenium.By;

public class MainPage extends PageTools {
    private By userMenuButton = By.xpath("//div [@class =\"UserMenu__MenuWrapper-sc-1fu4vmt-5 ezjemF\"]/..");
    private By dropdownMenuFirstButton = By.xpath("//div [@class =\"UserMenu__MenuWrapper-sc-1fu4vmt-5 ezjemF\"]/ul/li");

    public void clickUserMenu (){
        click(userMenuButton);
    }
    public boolean isPageContainsLogOutButton () {
        return isElementVisible(dropdownMenuFirstButton);
    }

}
