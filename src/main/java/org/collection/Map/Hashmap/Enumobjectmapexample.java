package org.collection.Map.Hashmap;

import java.security.Key;
import java.util.EnumMap;
import java.util.Map;

enum type {
    PALM, MANGO, ORCHID, ORKUT,
}

class Tree {
    int treeId;
    String treeName;
    String treeRoot;
    String type;
    int treeCount;

    public Tree(int treeId, String treeName, String treeRoot, String type, int treeCount) {
        this.treeId = treeId;
        this.treeName = treeName;
        this.treeRoot = treeRoot;
        this.type = type;
        this.treeCount = treeCount;
    }


}

public class Enumobjectmapexample {
    public static void main(String[] args) {
        Tree t1 = new Tree(101, "Tree1", "Treeroot1", "type1", 10);
        Tree t2 = new Tree(102, "Tree2", "Treeroot2", "type2", 10);
        Tree t3 = new Tree(103, "Tree3", "Treeroot3", "type3", 10);
        Tree t4 = new Tree(105, "Tree4", "Treeroot4", "type4", 10);
        Tree t5 = new Tree(106, "Tree5", "Treeroot5", "type5", 10);
        Tree t6 = new Tree(107, "Tree6", "Treeroot6", "type6", 10);

        EnumMap<type, Tree> enumMap = new EnumMap<type, Tree>(type.class);
        enumMap.put(type.PALM, t1);
        enumMap.put(type.MANGO, t2);
        enumMap.put(type.ORCHID, t3);
        enumMap.put(type.ORKUT, t4);
        enumMap.put(type.PALM, t5);
        enumMap.put(type.ORCHID, t6);

        for (Map.Entry<type, Tree> map : enumMap.entrySet()) {
            Tree t = map.getValue();
            System.out.println(t.treeId + " " + t.treeName + " " + t.treeRoot + " " + t.treeCount + " " + t.type);
        }

    }
}
