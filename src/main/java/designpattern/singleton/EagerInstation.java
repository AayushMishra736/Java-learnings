package designpattern.singleton;

public class EagerInstation {
    public static EagerInstation obj = new EagerInstation();
    private EagerInstation(){

    }
    public static EagerInstation getInstance(){
        return obj;
    }

}