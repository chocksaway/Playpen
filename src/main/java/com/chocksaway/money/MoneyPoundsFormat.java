package com.chocksaway.money;

import java.text.DecimalFormat;

public class MoneyPoundsFormat {
    private final double calcCharge;
    private final DecimalFormat decimalFormat;

    public MoneyPoundsFormat(final double calcCharge, final String format) {
        this.calcCharge = calcCharge;
        this.decimalFormat = new DecimalFormat(format);
    }

    public String display() {
        return this.decimalFormat.format(this.calcCharge);
    }
}
