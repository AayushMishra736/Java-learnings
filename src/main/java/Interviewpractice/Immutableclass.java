package Interviewpractice;

import java.util.HashMap;
import java.util.Map;

class Students {

    private final int id;
    private final String name;
    private final Map<String, String> metaData;

    public Students(int id, String name, Map<String, String> metaData) {
        this.id = id;
        this.name = name;
        Map<String, String> finalMap = new HashMap<>();
        for (Map.Entry<String, String> entry : metaData.entrySet()) {
            finalMap.put(entry.getKey(), entry.getValue());
        }
        this.metaData = finalMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getMetaData() {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : metaData.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }


}

public class Immutableclass {
    public static void main(String[] args) {
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("1", "value1");
        studentMap.put("2", "value2");

        Students s1 = new Students(1, "John", studentMap);

        System.out.println(s1.getId() + " : " + s1.getName() + " : " + s1.getMetaData());

        studentMap.put("3", "value3");

        System.out.println(s1.getMetaData());
        s1.getMetaData().put("4", "value4");

        System.out.println(s1.getMetaData());
    }
}

