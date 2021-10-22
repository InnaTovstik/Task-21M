package org.example;

public class Task4 {

    static void triFunctionExample() {
        TriFunction<String> triFunction = (d1, d2, d3) -> (d1 + d2 + d3);
        System.out.println(triFunction.func("Hello", ", ", "world!"));

        TriFunction<Integer> triFunction1 = (d1, d2, d3) -> (d1 * d2 * d3);
        System.out.println("volume = " + triFunction1.func(2, 3, 4));
    }
}
