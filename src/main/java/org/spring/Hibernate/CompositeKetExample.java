package org.spring.Hibernate;

import java.io.Serializable;

class BookId implements Serializable {
    private String title;
    private String publication;

    public BookId(String title,String publication){
        this.publication = publication;
        this.title = title;
    }
}


public class CompositeKetExample
{
}
