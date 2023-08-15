package org.createObject;

class Bike {
    int id;
    String bikeColor;

    public Bike(int id,String bikeColor){
        this.bikeColor = bikeColor;
        this.id = id;
    }

    public static Bike createBike(int id, String bikeColor){
        return new Bike(id,bikeColor);
    }

    String bikeInfo(){
        return "This is info related to bike with id "  + id + " having color " + bikeColor;
    }

}

public class byFactoryMethod {
    public static void main(String[] args) {
        Bike bike = Bike.createBike(101,"Red");
        System.out.println(bike.bikeInfo());
    }
}






