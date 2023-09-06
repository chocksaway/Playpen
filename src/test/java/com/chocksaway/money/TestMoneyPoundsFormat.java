package com.chocksaway.money;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestMoneyPoundsFormat {
    MoneyPoundsFormat moneyPoundsFormat;

    @Before
    public void init() {
        moneyPoundsFormat = new MoneyPoundsFormat(10.00, "£0.00");
    }

    @Test
    public void testPoundsMoneyFormat() {
        assertEquals("£10.00", moneyPoundsFormat.display());
    }
}
