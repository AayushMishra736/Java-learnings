package datastructure.basicprograms;

public class StringArray {
    public static void main(String[] args) {
        String str = "ABC(D)";
        methodToCheck(str);
    }

    private static void methodToCheck(String str) {
        int a[] = new int[10];
        char[] ch = str.toCharArray();
        boolean flag = false;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == '(') {
                    if (ch[j] == ')') {
                        a[i] = 1;
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
            }
        }
        System.out.println("Senario result " + flag);

    }

}
