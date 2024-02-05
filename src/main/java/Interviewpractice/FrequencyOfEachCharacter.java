package Interviewpractice;

import java.io.CharConversionException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";


        Character ch = input.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c))).
                collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst().get();
    }
}
