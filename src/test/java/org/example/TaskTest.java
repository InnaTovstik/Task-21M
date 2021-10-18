package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {

    @Test
    public void shouldfilterNumber() {
        int[] num = {1, 2, 3, 4, 5};
        String expected = "4, 16";
        assertEquals(expected, Task1.filterNumber(num));
    }

    @Test
    public void shouldTrueIsTwoStringUpperCase() {
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Smith");
        list.add("Samueal");
        assertTrue(Task2.isTwoStringUpperCase(list));
    }

    @Test
    public void shouldFalseIsTwoStringUpperCase() {
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("smith");
        list.add("samueal");
        assertFalse(Task2.isTwoStringUpperCase(list));
    }

    @Test
    public void shouldFindListKey() {
        Map<Integer, Boolean> myMap = new HashMap<>();
        myMap.put(1, true);
        myMap.put(6, false);
        myMap.put(9, true);
        myMap.put(12, false);
        myMap.put(19, true);
        myMap.put(21, true);
        List<Integer> expected = new ArrayList<>();
        expected.add(21);
        expected.add(19);
        expected.add(9);
        expected.add(1);
        assertEquals(expected, Task3.findListKey(myMap));
    }
}
