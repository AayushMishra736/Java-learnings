package designpattern.singleton.breaksingletondesignpattern;

class Superclass implements Cloneable {
    int i = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Singleton2 extends Superclass {
    public static Singleton2 instance = new Singleton2();

    public Singleton2() {

    }
}

public class Cloningcausetobreaksingleton {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton2 instance1 = Singleton2.instance;
        Singleton2 instance2 = (Singleton2) instance1.clone();

        System.out.println("Instance 1 " + instance1.hashCode());
        System.out.println("Instance 2 " + instance2.hashCode());
    }
}
