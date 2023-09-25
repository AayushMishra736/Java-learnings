package org.collection.Arraylist;

import java.util.ArrayList;

public class Sortanarraylistbybubblesort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        int max = arrayList.get(0);

        //bubble sort
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size() - 1; j++){
                if(arrayList.get(i) < arrayList.get(j)) {
                int temp = arrayList.get(i);
                arrayList.set(i,arrayList.get(j));
                arrayList.set(j,temp);
                }
            }
        }
        System.out.println(arrayList);
    }


}
