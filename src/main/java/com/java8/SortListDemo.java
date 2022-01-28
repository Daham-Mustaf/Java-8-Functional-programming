package com.java8;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(12);
        // java old way...
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        // java 8
        list.stream().sorted().forEach(s-> System.out.println("Assending order: "+ s));
        list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s));

    }
}
