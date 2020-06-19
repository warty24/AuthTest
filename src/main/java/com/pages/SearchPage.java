package com.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class SearchPage {

    private By searchResults = By.cssSelector(".s-include-content-margin.s-border-bottom.s-latency-cf-section");

    private ArrayList<WebElement> searchWElements = new ArrayList<>();

    public void findResults () {
       searchWElements.addAll(Selenide.$$(searchResults));
        System.out.println(searchWElements.size());
    }

}
