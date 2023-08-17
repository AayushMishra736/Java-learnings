package org.aggregation;

import java.sql.SQLOutput;

class Address{
    int flatNo;
    String streetName;
    String city;
    String state;

    public Address(int flatNo, String streetName, String city, String state){
        this.flatNo = flatNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

}
class Employee{
    int empId;
    String name;
    Address address;

    public Employee(int empId,String name, Address address){
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(empId + " " + name);
        System.out.println(address.flatNo+ " " + address.streetName + " " + address.city + " " + address.state);
    }
}

public class AggregationExample2 {
    public static void main(String[] args) {
        Address ad = new Address(441,"Shakti Khand 4","Noida","UP");
        Employee e = new Employee(101,"John",ad);
        e.display();
    }
}
