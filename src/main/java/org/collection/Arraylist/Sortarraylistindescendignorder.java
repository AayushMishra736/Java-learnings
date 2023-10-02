package org.collection.Arraylist;

import java.util.Arrays;
import java.util.List;

public class Sortarraylistindescendignorder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,7,12,3,1,34);
        for(int i = 0;i < list.size();i++){
          for(int j = 0;j < list.size();j++){
           if(list.get(i) > list.get(j)){
               int temp = list.get(j);
               list.set(j,list.get(i));
               list.set(i,temp);
           }
          }
        }
        System.out.println(list);
    }
}
