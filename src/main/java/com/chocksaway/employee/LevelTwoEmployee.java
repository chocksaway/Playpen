package com.chocksaway.employee;

public class LevelTwoEmployee extends LevelOneEmployee {
    private final String levelTwoName;

    public LevelTwoEmployee(String levelTwoName, String levelOneName, String name) {
        super(levelOneName, name);
        this.levelTwoName = levelTwoName;
    }
}
