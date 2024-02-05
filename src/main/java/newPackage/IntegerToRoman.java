package newPackage;

public class IntegerToRoman {
    public static void main(String[] args) {
     String str = "1234";
     convertToRoman(str);

    }

    private static void convertToRoman(String str) {
        int n = str.length();
        for(int i = n -1;i >= 0;i++){


        }

    }


    int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}
