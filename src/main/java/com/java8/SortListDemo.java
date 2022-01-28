package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

    }
}
