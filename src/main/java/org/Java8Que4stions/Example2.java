package org.Java8Que4stions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream<String> stream1 = Stream.concat(list1.stream(),list2.stream());

        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        List<Integer> resultIntegerList = integerList.stream().map(i -> i*i*i).filter(n -> n > 50).collect(Collectors.toList());

        System.out.println(" ResultIntegerList : " + resultIntegerList);

        List<String> upperCaseList = list2.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());


    }
}
