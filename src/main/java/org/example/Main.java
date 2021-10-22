package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1.");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays
                .stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));
        System.out.println(Task1.filterNumber(numbers));

        System.out.println("Task2.");
        List<String> list = new ArrayList<>(
                Arrays.asList("John", "smith", "Samueal", "catley", "Sie"));
        System.out.println("В коллекции больше 2 строк, которые начинаются с заглавной буквы " +
                list + " - " + Task2.isTwoStringUpperCase(list));

        System.out.println("Task3.");
        Map<Integer, Boolean> myMap = new HashMap<>();
        myMap.put(1, true);
        myMap.put(6, false);
        myMap.put(9, true);
        myMap.put(12, false);
        myMap.put(19, true);
        myMap.put(21, true);
        System.out.println(Task3.findListKey(myMap));

    }
}
