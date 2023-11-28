package org.Java8.PracticeQuestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectorsfunctions {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Anna");

        Map<Object,List<String>> listStartWithA = names.stream().collect(Collectors.groupingBy(s -> s.charAt(0) == 'A'));

        System.out.println("groupingBy(): " + listStartWithA);

        Map<Boolean, List<String>> partinonedList = names.stream().collect(Collectors.partitioningBy(s -> s.length() > 4));

        System.out.println("partinonedList(): " + partinonedList);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        long count = numbers.stream().collect(Collectors.counting());

        IntSummaryStatistics intSummaryStatistics = numbers.stream().collect(Collectors.summarizingInt(i -> i));



    }
}
