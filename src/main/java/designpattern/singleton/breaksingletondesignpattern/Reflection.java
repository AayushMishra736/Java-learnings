package designpattern.singleton.breaksingletondesignpattern;

import java.lang.reflect.Constructor;

class Singleton {
    public static Singleton instance = new Singleton();

    public Singleton() {

    }
}


public class Reflection {

    public static void main(String[] args) throws IllegalStateException {
        Singleton instance1 = Singleton.instance;
        Singleton instance2 = null;
        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for(Constructor constructor:constructors){
                constructor.setAccessible(true);
                instance2 = (Singleton)constructor.newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("First Object " + instance1.hashCode());
        System.out.println("Second Object " + instance2.hashCode());
    }
}
