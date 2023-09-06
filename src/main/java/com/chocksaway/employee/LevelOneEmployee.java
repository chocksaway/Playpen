package com.chocksaway.employee;

public class LevelOneEmployee extends BaseEmployee {
    private final String levelOneName;

    public LevelOneEmployee(String levelOneName, String name) {
        super(name);
        this.levelOneName = levelOneName;
    }
}
