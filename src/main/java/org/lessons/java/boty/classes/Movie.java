package org.lessons.java.boty.classes;

public class Movie {
    private int id;
    private String title;

    public Movie(){};

    public Movie(int id, String title){
        this.id = id;
        this.title = title;
    };

    public String getMovie(){
        return this.title;
    };
}
