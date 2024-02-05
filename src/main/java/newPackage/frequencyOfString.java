package newPackage;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfString {
    public static void main(String[] args) {
        String str = "aaddeerrtefsasfdg'sknlhdfgafZ?K.vbsemn;ldkfZ";
        frequencyOfStringMethod(str);
    }

    private static void frequencyOfStringMethod(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(ch[i])) {
                hashMap.put(ch[i], 1);
            } else {
                hashMap.put(ch[i], hashMap.get(ch[i]) + 1);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()){
            Character check = entry.getKey();
            int value  = entry.getValue();
            String stringNew = check + String.valueOf(value);
            stringBuffer.append(stringNew);
        }
        System.out.println(stringBuffer);
    }

}
