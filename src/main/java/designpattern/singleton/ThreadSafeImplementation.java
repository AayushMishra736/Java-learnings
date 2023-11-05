package designpattern.singleton;

public class ThreadSafeImplementation {
    public static ThreadSafeImplementation obj;

    private ThreadSafeImplementation(){}

    public static synchronized ThreadSafeImplementation getInstance(){
        if(obj == null){
            obj = new ThreadSafeImplementation();
        }
        return obj;
    }

}
