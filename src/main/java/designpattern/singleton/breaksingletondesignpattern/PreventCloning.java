package designpattern.singleton.breaksingletondesignpattern;

class Superclass1 implements Cloneable {
    int i = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Singleton3 extends Superclass1{

    public static Singleton3 instance = new Singleton3();

    private Singleton3(){

    }

    protected Object clone() throws CloneNotSupportedException{
        return instance;
    }

}

public class PreventCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton3 instance1 = Singleton3.instance;
        Singleton3 instance2 = (Singleton3)instance1.clone();

        System.out.println("Instance 1 " + instance1.hashCode());
        System.out.println("Instance 2 " + instance2.hashCode());
    }
}
