package com.java8;

import com.java8.model.Student;
import com.java8.model.StudentDB;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Student> studentList = StudentDB.getAll();
        // list of Students to Strong list
        // one to one mapping
        studentList.stream().map(s->s.getEmail()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
