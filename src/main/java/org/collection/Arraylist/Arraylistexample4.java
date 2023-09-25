package org.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Address{
    int plotNo;
    String streetName;
    String city;
    String district;
    String state;
    long pincode;

    public Address(int plotNo,String streetName,String city, String district, String state, long pincode){
    this.plotNo = plotNo;
    this.streetName = streetName;
    this.city = city;
    this.district = district;
    this.state = state;
    this.pincode = pincode;
    }
}

public class Arraylistexample4 {
    public static void main(String[] args) {
        Address a1 = new Address(101,"street1","city1","district1","state1",0000001);
        Address a2 = new Address(102,"street2","city2","district2","state2",0000002);
        Address a3 = new Address(103,"street3","city3","district3","state3",0000003);
        Address a4 = new Address(104,"street4","city4","district4","state4",0000004);

        List<Address> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        ListIterator listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
        Address ad = (Address) listIterator.previous();
            System.out.println("Address is : " + ad.plotNo + " " + ad.streetName + " " + ad.city + " " + ad.district + " " + ad.state + " " + ad.pincode);
        }

    }
}



