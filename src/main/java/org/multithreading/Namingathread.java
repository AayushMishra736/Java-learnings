package org.multithreading;

class Settingthreadname implements Runnable {

    @Override
    public void run() {
        System.out.println("running a thread.......");
    }
}

public class Namingathread {
    public static void main(String[] args) {
        Settingthreadname s1 = new Settingthreadname();
        Thread thread1 = new Thread(s1);
        Settingthreadname s2 = new Settingthreadname();
        Thread thread2 = new Thread(s2);
        System.out.println("Name of a thread " + thread1.getName());
        System.out.println("Name of a thread " + thread2.getName());

        thread1.start();
        thread2.start();

        thread1.setName("Firstthread");
        thread2.setName("Secondthread");

        System.out.println("Name after setting name " + thread1.getName());

        System.out.println("Name after setting name " + thread2.getName());

    }

}
