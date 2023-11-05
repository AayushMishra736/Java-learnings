package designpattern.singleton;

public class Doublechecklocking {
    public static volatile Doublechecklocking obj;
    private Doublechecklocking(){

    }

    public static Doublechecklocking getInstance(){
        if(obj == null){
            synchronized (Doublechecklocking.class){
                if(obj == null){
                    obj = new Doublechecklocking();
                }
            }
        }
        return obj;
    }

}
