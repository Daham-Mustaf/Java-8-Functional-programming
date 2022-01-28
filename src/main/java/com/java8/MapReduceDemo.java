package com.java8;

import java.util.Arrays;
import java.util.List;

public class MapReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
        // summ of the numbers
        int sum =0;
        for(Integer in: numbers){
            sum=sum+in;
        }
        System.out.println(sum);
        // functional programming
       int sumOfStream= numbers.stream().mapToInt(i->i).sum();
        System.out.println(sumOfStream);

        // reduce method
        int sumReduce = numbers.stream().reduce(0, (a,b)-> a+b);
        System.out.println("sumReduce is :"+ sumReduce);

        int multiplyReduce = numbers.stream().reduce(1, (a,b)-> a*b);
        System.out.println("multiplyReduce is :"+ multiplyReduce);
        int maxValue = numbers.stream().reduce(0, (a,b)-> a > b ? a : b);
        System.out.println("max Value is :"+ maxValue);

    }
}
