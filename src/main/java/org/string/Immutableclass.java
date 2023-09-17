package org.string;

import java.util.HashMap;
import java.util.Map;

final class Student {
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;
    public Student(String name, int regNo,
                   Map<String, String> metadata) {
        this.name = name;
        this.regNo = regNo;

        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.metadata = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetadata() {

        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}

public class Immutableclass {
    public static void main(String[] args) {
        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("1", "First");
        tempMap.put("2", "Second");

        Student s = new Student( "Abhay",101, tempMap);

        System.out.println(s.getRegNo());
        System.out.println(s.getName());
        System.out.println(s.getMetadata());

        tempMap.put("3", "Third");

        System.out.println(s.getMetadata());

    }
}