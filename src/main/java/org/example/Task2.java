package org.example;

import java.util.List;
import java.util.function.Predicate;

//Написать функцию-Predicate.
// Предикат должен принимать коллекцию строк (Predicate<List<String>>) и
// проверять содержится ли в ней больше 2 строк, которые начинаются с заглавной буквы (upper case).
// Эту проверку также нужно сделать с помощью Stream API.
// Используйте функцию count() из Stream API
public class Task2 {

    static boolean isTwoStringUpperCase(List<String> list) {

        Predicate <List<String>> tester = Task2::filterList;
        long count = list.stream()
                .map(s -> list)
                .filter(tester)
                .count();
           return count > 2;
    }

    private static boolean filterList(List<String> list) {
        int count = 0;
        for (String lst : list)
            if (Character.isUpperCase(lst.charAt(0))) {
                count++;
            }
        return count > 2;
    }
}