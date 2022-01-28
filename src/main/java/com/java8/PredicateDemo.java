package com.java8;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        if (integer % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicateDemo();
        System.out.println(predicate.test(4));
        System.out.println(predicate.test(7));

        Predicate<Integer> predicate1 = (integer) -> {
            if (integer % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(predicate1.test(9));

        Predicate<Integer> predicate3 = integer -> integer % 2 == 0;
        System.out.println(predicate3.test(9));
    }
}
