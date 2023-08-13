package org.basic;

public class Operators {

    private static volatile boolean flag = true;

    public static void main(String[] args) {
        System.out.println("-----------left shift operator-----------");
        System.out.println(10 << 2);//10*2^2=10*4=40
        System.out.println(10 << 3);//10*2^3=10*8=80
        System.out.println("-----------right shift operator-----------");
        System.out.println(10 >> 3);//20/2^3=20/8=2
        System.out.println(10 >> 2);//10/2^2=10/4=2

        System.out.println("-----------Java AND Operator Example: Logical && vs Bitwise &-----------");
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a++ < c);
        System.out.println(a);
        System.out.println(a < b & a++ < c);
        System.out.println(a);

        System.out.println("-----------Java OR Operator Example: Logical || and Bitwise |-----------");
        System.out.println(a > b || a < c);
        System.out.println(a > b | a < c);
        System.out.println(a > b || a++ < c);
        System.out.println(a);
        System.out.println(a > b | a++ < c);
        System.out.println(a);

        System.out.println("------Java Ternary Operator-------");
        System.out.println(a < b ? true : null);

        short d = 10;
        short e = 10;
        //complie time error d = a + e;
        d = (short) (d + e);
        System.out.println(d);

        float f = 20.98f;
        System.out.println("------------strictfp-------------");
        performCalculation(20.9, 78.9);

        System.out.println("-----toggleFlag-----");
        toogleFlag();
        System.out.println(flag);
        System.out.println("----isFlag----");
        isFlag();
        System.out.println(flag);
    }

    public static strictfp void performCalculation(double x, double y) {
        System.out.println(x * y + Math.sqrt(x));
    }

    public static void toogleFlag() {
        flag = !flag;
    }

    public static boolean isFlag() {
        return flag;
    }
}
