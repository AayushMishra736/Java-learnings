package datastructure.basicprograms;

import java.util.HashMap;
import java.util.Map;


public class FrequencyOfChar {
    public static void main(String[] args) {
        String a = "GeeksForGeek";
        frequencyOfString(a);
    }

    private static void frequencyOfString(String a) {
       HashMap<Character,Integer> hashMap = new HashMap<>();
       char[] chararray = a.toCharArray();

       for(char c : chararray){
        if(hashMap.containsKey(c)){
            hashMap.put(c,hashMap.get(c) + 1);
        }
        else{
            hashMap.put(c,1);
        }
       }

       for(Map.Entry entry : hashMap.entrySet()){
           System.out.println(entry.getKey() + " - " + entry.getValue());
       }
    }
}
