package com.abc.java;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findFirstNoRepetativeCharacter {

    public static void main(String[] args) {
        String str="My Name is khan";

        Character ch=str.chars()
                .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()==1)
                .map(entry->entry.getKey())
                .findFirst().get();

        System.out.println(ch);
    }
}
