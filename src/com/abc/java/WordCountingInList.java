package com.abc.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountingInList {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("cat","dog","fat","mat","cat","elephat","hen","Dog","Deer","Bear","bear",
        "lion","Tiger","LION");

        stringList.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)->System.out.println("Key= "+k+" Value=  " +v));
    }
}
