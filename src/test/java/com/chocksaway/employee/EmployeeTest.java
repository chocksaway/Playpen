package com.chocksaway.employee;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class EmployeeTest {
    @Test
    public void testEmployeeLevels() {
        List<BaseEmployee> employees = new ArrayList<>();

        BaseEmployee baseEmployee = new BaseEmployee("miles");
        LevelOneEmployee levelOneEmployee = new LevelOneEmployee("level1", "bob");
        LevelTwoEmployee levelTwoEmployee = new LevelTwoEmployee("level2", "level1", "bob");
        employees.add(baseEmployee);
        employees.add(levelOneEmployee);
        employees.add(levelTwoEmployee);

        assertEquals(BaseEmployee.class, employees.get(0).getClass());
        assertEquals(LevelOneEmployee.class, employees.get(1).getClass());
        assertEquals(LevelTwoEmployee.class, employees.get(2).getClass());
    }
}
