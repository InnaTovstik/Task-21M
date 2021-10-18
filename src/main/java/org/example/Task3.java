package org.example;
// Дана карта Map<Integer, Boolean> (можно захардкодить ее содержимое).
// С помощью Stream API вернуть список ключей, у которых значения - true.
// Список должен быть отсортирован по убыванию (от большего к меньшему)

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {

    static List<Integer> findListKey(Map<Integer, Boolean> myMap) {

        return myMap.entrySet().stream()
                .filter(entry -> entry.getValue() == true)
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
