package org.lessons.java.boty.classes;

public class Song {
    private int id;
    private String title;

    public Song(){};
    
    public Song(int id, String title){
        this.id = id;
        this.title = title;
    };

    public String getSong(){
        return this.title;
    };
}
