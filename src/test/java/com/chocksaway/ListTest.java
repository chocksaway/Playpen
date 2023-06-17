package com.chocksaway;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListTest {
    @Test
    public void testArrayListFilteredLength() {
        List<String> simpleList = Arrays.asList("one", "two", "three");
        assertEquals(2, simpleList.stream()
                .filter(each -> each.length() <= 3)
                .count());
    }
}
