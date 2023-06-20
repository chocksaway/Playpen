package com.chocksaway;

import com.chocksaway.car.ElectricCar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    @Test
    public void testMyTestCar() {
        ElectricCar electricCar = new ElectricCar("My Electric Car");
        assertEquals("My Electric Car", electricCar.getCarType());
        electricCar.speedUp();
        electricCar.slowDown();
        electricCar.turnLeft();
        electricCar.turnRight();
    }
}
