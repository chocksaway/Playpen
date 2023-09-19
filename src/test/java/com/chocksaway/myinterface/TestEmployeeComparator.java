package com.chocksaway.myinterface;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestEmployeeComparator {
    List<Employee> employees;

    @Before
    public void init() {
        employees = Arrays.asList(
                new Employee("miles", 20000),
                new Employee("john", 10000)
        );
    }

    @Test
    public void testSortEmployees() {
        Collections.sort(employees);
        assertEquals("miles", employees.get(1).getName());
    }
}
