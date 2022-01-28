package com.java8;

import java.util.List;
import java.util.function.Supplier;

public class SupllyierInterface implements Supplier<String> {
    @Override
    public String get() {
        return "Hi functional programming! ";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupllyierInterface();
        System.out.println(supplier.get());

        // to lambda expression
        Supplier<String> supplier1 = () ->{ return "Hi functional programming! ";
    };
        System.out.println(supplier1.get());
        List<String> list = List.of("a","b","c","d");
        list.stream().findAny().orElseGet(() -> "Hi functional programming! ");
}
}
