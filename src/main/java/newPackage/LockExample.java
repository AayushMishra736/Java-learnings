package newPackage;

public class LockExample {
    public static void main(String[] args) {
        final String first = "resource1";
        final String second = "resource2";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                    System.out.println("Executing first thread from first method" + first);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (second) {
                        System.out.println("Executing second thread from first method " + second);
                    }
                }
            }
        };


        Thread t2 = new Thread() {
            public void run() {
                synchronized (second) {
                    System.out.println("Executing first thread from second method " + second);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized (first) {
                        System.out.println("Executing first thread from second method " + first);
                    }
                }
            }
        };

        t1.start();
        t2.start();

    }
}
