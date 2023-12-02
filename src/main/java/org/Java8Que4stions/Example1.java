package org.Java8Que4stions;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,454,5,66,7);
        long count = list.stream().collect(Collectors.counting());
        System.out.println("Count : " + count);

        Double average = list.stream().collect(Collectors.averagingInt(s -> s));
        System.out.println("Average : " + average);

        List<String> listString = Arrays.asList("A","B","C","D","E","F");
        String joinedValue = listString.stream().collect(Collectors.joining("-"));

        System.out.println("JoinedValue :" + joinedValue);

        List<Integer> listOfInteger = Arrays.asList(10,15,8,49,25,98,98,32,15);

        listOfInteger.stream().filter(s -> s%2 == 0).forEach(System.out::print);

        List<String> startingWith1 = listOfInteger.stream().map(s -> s.toString()).filter(s -> s.startsWith("1")).collect(Collectors.toList());

        HashSet<Integer> hashSet = new HashSet<>();

        List<Integer> showDuplicate = listOfInteger.stream().filter(s -> !hashSet.add(s)).collect(Collectors.toList());

        System.out.println();
        System.out.println("Duplicates in an array : " + showDuplicate);

        System.out.print("FirstElement : ");
        listOfInteger.stream().findFirst().ifPresent(System.out::println);

        long totalCount = listOfInteger.stream().collect(Collectors.counting());

        System.out.println("TotalCount : " + totalCount);

        Optional<Integer> maxValue = listOfInteger.stream().sorted(Collections.reverseOrder()).findFirst();
        System.out.println("Max Value : " + maxValue);

        int max = listOfInteger.stream().max(Integer::compare).get();
        System.out.println("Max value only integer " + max);

    }

}
