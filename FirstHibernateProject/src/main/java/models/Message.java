package main.java.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String test;

    public String getText() {
        return test;
    }

    public void setText(String text) {
        this.test = text;
    }

}
