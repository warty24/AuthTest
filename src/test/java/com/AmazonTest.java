package com;

import com.actions.Actions;
import com.collections.Collections;
import com.core.base.BaseTest;
import com.pages.Pages;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
    @Test
    public void amazonTest() {
        Actions.mainPageActions().search("java","Books");
        Actions.searchPageActions().collectRresults();
        Actions.productPageActions().createExpectedBook();
        System.out.println(Actions.productPageActions().findBookInCollection());
    }
}
