package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

// С помощью Stream API отфильтровать только четные числа и сформировать новый список из квадратов их значений.
// Input: [1, 2, 3, 4, 5]
// Output: [4, 16]
public class Task1 {

    static String filterNumber(int[] numbers) {

        return Arrays
                .stream(numbers)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}