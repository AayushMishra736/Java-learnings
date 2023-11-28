package org.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyCalculator {
    public static void main(String[] args) {
        String s = "aayushMishra";
        char ch[] = s.toCharArray();
        Map<Character,Integer> frequencyMap = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            if(frequencyMap.containsKey(ch[i])){
                frequencyMap.put(ch[i],frequencyMap.get(ch[i]) + 1);
            }
            else{
                frequencyMap.put(ch[i],1);
            }
        }

        for(Map.Entry<Character,Integer> entry : frequencyMap.entrySet()){
            System.out.println("Character : " + entry.getKey() + " Integer : " + entry.getValue());
        }

        Map<Character,Long> integerMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Values by java 8 : ");

        for(Map.Entry<Character,Integer> entry : frequencyMap.entrySet()){
            System.out.println("Character : " + entry.getKey() + " Value : " + entry.getValue());
        }

        Map<Character,Long> frequency = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for(Map.Entry<Character, Long> entry : frequency.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
