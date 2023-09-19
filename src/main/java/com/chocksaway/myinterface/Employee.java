package com.chocksaway.myinterface;

public class Employee implements Comparable<Employee> {
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Employee otherObject) {
        return Double.compare(salary, otherObject.salary);
    }
}
