package org.string.stringmethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexexample {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("s");
        Matcher m = p.matcher("as");
        boolean b1 = m.matches();
        boolean b2 = Pattern.compile("as").matcher("asleep").matches();
        boolean b3 = Pattern.matches("s","as");
        System.out.println("b1 " + b1 + " b2 " + b2 + " b3 " + b3);
    }

}
