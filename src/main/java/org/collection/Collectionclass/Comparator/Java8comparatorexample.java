package org.collection.Collectionclass.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Java {
    int processId;
    String method;
    String fucntions;
    int version;

    public Java(int processId, String method, String fucntions, int version) {
        this.processId = processId;
        this.method = method;
        this.fucntions = fucntions;
        this.version = version;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFucntions() {
        return fucntions;
    }

    public void setFucntions(String fucntions) {
        this.fucntions = fucntions;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}


public class Java8comparatorexample {
    public static void main(String[] args) {
        List<Java> list = new ArrayList<>();
        list.add(new Java(1001, "Method4", "Function1", 15));
        list.add(new Java(1021, "Method3", "Function2", 6));
        list.add(new Java(1301, "Method2", "Function3", 17));
        list.add(new Java(4001, "Method1", "Function4", 8));
        Comparator<Java> comparator1 = Comparator.comparing(Java::getMethod);
        System.out.println("Sorting by method() : ");
        Collections.sort(list, comparator1);
        for (Java j : list) {
            System.out.println(j.processId + " " + j.method + " " + j.fucntions + " " + j.version);
        }
        System.out.println("Sorting by version : ");
        Comparator<Java> cm2 = Comparator.comparing(Java::getVersion);
        Collections.sort(list, cm2);
        for (Java j : list) {
            System.out.println(j.processId + " " + j.method + " " + j.fucntions + " " + j.version);
        }
        System.out.println("Sorting by process id : ");
        Comparator<Java> comparator3 = Comparator.comparing(Java::getProcessId);
        Collections.sort(list, comparator3);
        for (Java j : list) {
            System.out.println(j.processId + " " + j.method + " " + j.fucntions + " " + j.version);
        }
    }
}
