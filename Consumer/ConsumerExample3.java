package com.durgasoft.Consumer;

import java.util.function.Consumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        Consumer<Integer> square = n -> System.out.println(n * n);
        square.accept(6);
    }
}

