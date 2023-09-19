package com.chocksaway.myinterface;

public record Employee(String name, int salary) implements Comparable<Employee> {
    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Employee otherObject) {
        return Double.compare(salary, otherObject.salary);
    }
}
