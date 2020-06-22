package com;

import com.actions.Actions;
import com.core.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AmazonTest extends BaseTest {
    @Test
    public void amazonTest() {
        Actions.mainPageActions().search("java","Books");
        Actions.searchPageActions().collectRresults();
        Actions.productPageActions().createExpectedBook();
        assertTrue (Actions.productPageActions().findBookInCollection());
    }
}
