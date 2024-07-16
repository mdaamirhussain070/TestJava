package com.abc.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfString {
    public static void main(String[] args) {

        List<String> listString= Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String stringFromList=listString.stream()
                .collect(Collectors.joining(",  ","{","}"));

        System.out.println(stringFromList);
    }
}
