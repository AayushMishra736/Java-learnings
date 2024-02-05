package newPackage;

public class Avoiddeadlock {
    public static void main(String[] args) {
        final String first = "Thread : 1";
        final String second = "Thread : 2";
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                synchronized (first) {
                    System.out.println("In block 1 of first block");
                    try {
                        Thread.sleep(400);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (second) {
                        System.out.println("In block 2 of first block");
                    }
                }

            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                synchronized (second) {
                    synchronized (first) {
                        System.out.println("In a block 1 of second block ");
                        synchronized (second) {
                            System.out.println("In a block 2 of second block ");
                        }
                    }
                }

            }
        };

        r1.run();
        r2.run();
    }
}
