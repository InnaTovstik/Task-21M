package org.example;

import java.util.List;
import java.util.function.Predicate;

//Написать функцию-Predicate.
// Предикат должен принимать коллекцию строк (Predicate<List<String>>) и
// проверять содержится ли в ней больше 2 строк, которые начинаются с заглавной буквы (upper case).
// Эту проверку также нужно сделать с помощью Stream API.
// Используйте функцию count() из Stream API
public class Task2 {

    static boolean isTwoStringUpperCase(List<String> list){

        Predicate<String> tester = str -> Character.isUpperCase(str.charAt(0));
        long countStr = list.stream().filter(tester).count();
        return countStr > 2;
    }



}
