package com.chocksaway.interview;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

import static junit.framework.TestCase.*;


public class StrOpTest {
    StrOp strOp;

    @Before
    public void setup() {
        strOp = new StrOp(Arrays.asList("one", "two", "three", "four"));
    }

    @Test
    public void isValidValuePresent() {
        assertTrue(strOp.isValueValid("four"));
    }

    @Test
    public void invalidValueIsNotPresent() {
        assertFalse(strOp.isValueValid("five"));
    }

    @Test
    public void calculateLengthOfString() {
        char[] value = "Friday".toCharArray();
        assertEquals(6, value.length );

        assertEquals("Friday", convertToString(value));
    }

    private String convertToString(char[] value) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (Character each : value) {
            stringBuilder.append(each);
        }
        return stringBuilder.toString();
    }


}