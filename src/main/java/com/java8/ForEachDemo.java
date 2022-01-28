package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        // traditional printing the list
        for(String s : list){
            System.out.println(s);
        }
        // java 8
        list.stream().forEach(System.out::println);
    }
}
