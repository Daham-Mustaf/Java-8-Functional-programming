package com.java8;

import java.util.*;

public class MapSorting {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "Java");
        map.put(9, "C++");
        map.put(1, "R");
        // traditional way
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
          @Override
          public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
              return o1.getKey().compareTo(o2.getKey());
          }
         });
      for(Map.Entry<Integer, String> s: entries){
          System.out.println(s);
      }

      // functional way
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entries,(o1,o2)-> o1.getKey().compareTo(o2.getKey()));
        for(Map.Entry<Integer, String> s: entryList){
            System.out.println(s);
        }
    }
}
