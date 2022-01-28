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
        // email addresses are not a list of date can be mapped to string list
        studentList.stream().map(s->s.getEmail()).collect(Collectors.toList()).forEach(System.out::println);

        List<List<String>> phons =studentList.stream().map(student -> student.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phons); // [[123, 342], [4555, 342], [123, 342]]

        // flating data
        List<String> phone=
                studentList.stream().flatMap(student -> student.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phone);

    }
}
