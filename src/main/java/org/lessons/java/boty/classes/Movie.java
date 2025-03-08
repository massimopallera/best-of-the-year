package org.lessons.java.boty.classes;

import java.io.Serializable;

public class Movie implements Serializable{
    private int id;
    private String title;

    public Movie(){};

    public Movie(int id, String title){
        this.id = id;
        this.title = title;
    };

    public String getTitle(){
        return this.title;
    };

    public int getId(){
        return this.id;
    }
    public void setTitle(String title){
        this.title = title;
    };

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s", title);
    }
}
