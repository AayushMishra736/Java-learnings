package Interviewpractice;

class Invalidageexception extends Throwable {

    public Invalidageexception(String str) {
        super(str);
    }


}

public class Customexception {

    static void validate(int age) {
        try {
            if (age < 18)
                throw new Invalidageexception("Age is not valid ");
        } catch (Invalidageexception e) {
            System.out.println("Age is not valid for vote");
        }
    }

    public static void main(String[] args) {
     int i = 17;
        validate(i);
    }

}
