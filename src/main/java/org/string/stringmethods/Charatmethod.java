package org.string.stringmethods;

import java.util.Locale;

public class Charatmethod {
    public static void main(String[] args) {
        String s = "Welcome name is john snow";
        characterAtOddPlace(s);
        System.out.println();
        System.out.println("Counting the frequency!!");
        countingTheFrequency(s);
        s = "One apple in a day keeps doctor away.";
        System.out.println("Counting the number of vowels!!");
        countingTheVowels(s);
    }

    private static void countingTheVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for(int i =0;i < s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
              count++;
            }
        }
        System.out.println("Total vowels in string are " + count);
    }

    private static void countingTheFrequency(String s) {
        int count = 0;
        for(int i =0;i < s.length();i++){
            if(s.charAt(i) == 'o'){
                count++;
            }
        }
        System.out.println("The frequency of o is :" + count);
    }

    private static void characterAtOddPlace(String s) {
        for(int i = 0;i < s.length();i++){
            if(i % 2 != 0){
                System.out.print(s.charAt(i) + " ");
            }
        }
    }
}
