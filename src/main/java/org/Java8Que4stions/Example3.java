package org.Java8Que4stions;

import java.util.*;
import java.util.stream.Collectors;

class Notes{
    private int id;
    private String name;
    private int pageNumber;

    public Notes(int id,String name,int pageNumber){
        this.id = id;
        this.name = name;
        this.pageNumber = pageNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}

public class Example3 {

    public static void main(String[] args) {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));

        Map<String,Integer> mapResult = noteLst.stream()
                .sorted(Comparator
                        .comparingLong(Notes::getId)
                        .reversed()) // sorting is based on TagId 55,44,33,22,11
                .collect(Collectors.toMap
                        (Notes::getName, Notes::getId,
                                (oldValue, newValue) -> oldValue,LinkedHashMap::new));

        System.out.println("Notes : " + mapResult);

    }
}
