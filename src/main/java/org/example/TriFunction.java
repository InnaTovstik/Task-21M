package org.example;
//интерфейс TriFunction, который представляет собой функцию,
// которая принимает 3 параметра и имеет возращаемое значение.

interface TriFunction<T> {
     T func(T t1, T t2, T t3);
}
