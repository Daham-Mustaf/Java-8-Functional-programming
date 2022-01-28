package com.java8.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StudentDB {
    public static List<Student> getAll(){
        return Stream.of(
                new Student(101, "Daham", "Daham@mail", Arrays.asList("123", "342")),
                new Student(11, "Swara", "Swara@mail", Arrays.asList("4555", "342")),
                new Student(1, "Hawar", "Daham@mail", Arrays.asList("123", "342"))
        ).collect(Collectors.toList());

    }
}
