package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

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

        // how for each works internally ?
        Consumer<String> consumer = (t)-> System.out.println(t);
        for(String s : list){
            consumer.accept(s);
        }

        // java 8
        list.stream().forEach(System.out::println);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "R");
        map.forEach((key, value)-> System.out.println(key + ": "+ value));
        map.entrySet().stream().forEach(ma -> System.out.println(ma));

        // Filter out base on condensional check
        // traditional java filter
        for(String s : list){
            if(s.startsWith("J")){
            System.out.println("Filter -->"+ s);
        }
        }
        // java 8
        list.stream().filter(t->t.startsWith("C")).forEach(ma -> System.out.println("Filterd: "+ma));
    }
}
