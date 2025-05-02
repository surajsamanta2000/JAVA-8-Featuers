package com.durgasoft.Consumer;

import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        Consumer<String> stringLength = s -> System.out.println(s.length());
        stringLength.accept("Suraj");
    }
}

