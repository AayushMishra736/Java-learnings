package org.objectsandclass;

class Car {
    int modelNumber;
    String modelName;
    String modelColor;
    String type;
    boolean isRunning;

    public Car(int modelNumber, String modelName, String modelColor, String type, boolean isRunning) {
        this.modelNumber = modelNumber;
        this.modelName = modelName;
        this.modelColor = modelColor;
        this.type = type;
        this.isRunning = isRunning;
    }

    public void startEngine() {
        isRunning = true;
        System.out.println("The " + modelNumber + " named " + modelName + " having " + modelColor + "color of type " + type + "'s engine is now running.");
    }

    public void stopEngine() {
        isRunning = false;
        System.out.println("The " + modelNumber + " named " + modelName + " having " + modelColor + "color of type " + type + "'s engine is stopped.");
    }

    void display() {
        if (isRunning == true) {
            System.out.println(modelNumber + " " + modelName + " " + modelColor + " " + type + " is Running...");
        } else if (isRunning == false) {
            System.out.println(modelNumber + " " + modelName + " " + modelColor + " " + type + "stopped...");
        }

    }
}


public class Initializeobjectthroughconstructor {

    public static void main(String[] args) {
        Car car = new Car(1203, "Swift", "red", "sport", true);
        car.startEngine();
        car.display();
        car.stopEngine();
        car.display();
    }
}
