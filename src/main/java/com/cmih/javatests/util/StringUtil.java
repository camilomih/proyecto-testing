package com.cmih.javatests.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtil {

    public static String repeat(String str, int times) {

        if(times < 0){
            throw new IllegalArgumentException("Negative times not allowed");
        }

        String result = "";

        List<String> repeat = Stream.iterate(0, i -> i++)
                .limit(times).map(a -> str)
                .collect(Collectors.toList());
        return String.join(" ",repeat);
    }
}
