package com.chocksaway.interview;

import java.util.List;

public class StrOp {
    private final List<String> stringList;

    public StrOp(final List<String> stringList) {
        this.stringList = stringList;
    }

    public boolean isValueValid(final String op) {
        return stringList.stream().anyMatch(each -> each.equals(op));
    }
}