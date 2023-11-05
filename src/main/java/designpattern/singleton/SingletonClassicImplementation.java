package designpattern.singleton;

public class SingletonClassicImplementation {

private static SingletonClassicImplementation obj;

private SingletonClassicImplementation(){

}

public static SingletonClassicImplementation getInstance(){
    if(obj == null){
        obj = new SingletonClassicImplementation();
    }
    return obj;
}
}
