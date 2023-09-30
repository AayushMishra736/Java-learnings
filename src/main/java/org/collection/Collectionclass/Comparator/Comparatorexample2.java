package org.collection.Collectionclass.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mart{
    int productId;
    String productName;
    String productQuality;
    long price;

    public Mart(int productId, String productName, String productQuality, long price) {
        this.productId = productId;
        this.productName = productName;
        this.productQuality = productQuality;
        this.price = price;
    }
}

class Pricecomparator implements Comparator <Mart> {
    public int compare(Mart m1, Mart m2) {
        if (m1.price == m2.price) {
            return 0;
        } else if (m1.price > m2.price) {
            return 1;
        } else {
            return -1;
        }
    }
}


public class Comparatorexample2 {
    public static void main(String[] args) {
        List<Mart> list = new ArrayList<>();
        list.add(new Mart(101,"Product1","Quality1",201));
        list.add(new Mart(102,"Product2","Quality2",203));
        list.add(new Mart(103,"Product3","Quality3",204));
        list.add(new Mart(104,"Product4","Quality4",206));

        for(Mart m : list){
            System.out.println(m.productId + " " + m.productName + " " +m.productQuality + " " + m.price);
        }

        Collections.sort(list,new Pricecomparator());

        System.out.println("Price after comparison");

        for(Mart m : list){
            System.out.println(m.productId + " " + m.productName + " " +m.productQuality + " " + m.price);
        }
    }
}
