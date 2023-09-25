package org.collection.Arraylist;

import java.util.ArrayList;

public class Sortanarratlistbymergesort {
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
        System.out.println("List before sorting.." + arrayList);
        mergeSort(arrayList);
        System.out.println("List after sorting.." + arrayList);
    }
    public static void mergeSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return; // Already sorted
        }

        int mid = list.size() / 2;

        ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    private static void merge(ArrayList<Integer> list, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                list.set(k, left.get(i));
                i++;
            } else {
                list.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            list.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            list.set(k, right.get(j));
            j++;
            k++;
        }
    }
}