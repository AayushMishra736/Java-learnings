package designpattern.singleton.breaksingletondesignpattern;

enum Singletonenum{
    INSTANCE;
    int data;
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }
}

public class Preventreflection {
    public static void main(String[] args) {
        Singletonenum instance1 = Singletonenum.INSTANCE;
        Singletonenum instance2 = Singletonenum.INSTANCE;

        instance1.setData(42);

        System.out.println("Data from instance 1" + instance1.getData());
        System.out.println("Data from instance 2" + instance2.getData());
    }
}
