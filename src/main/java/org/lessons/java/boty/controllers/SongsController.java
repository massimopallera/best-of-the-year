package org.lessons.java.boty.controllers;

import org.lessons.java.boty.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/songs")
public class SongsController {
    
    // private String getBestSongs(){
    //     String str = "";

    //     for(int i = 0; i < songs.length; i++){
    //         str += songs[i].getTitle() + (i < songs.length-1 ? ", " : "");
    //     }

    //     return str;
    // };

    Song[] songs = new Song[]{
        new Song(1, "Bohemian Rhapsody"),
        new Song(2, "Stairway to Heaven"),
        new Song(3, "Hotel California"),
        new Song(4, "Imagine"),
        new Song(5, "Smells Like Teen Spirit"),
        new Song(6, "Billie Jean"),
        new Song(7, "Hey Jude"),
        new Song(8, "Sweet Child O' Mine"),
        new Song(9, "Shape of You"),
        new Song(10, "Lose Yourself")
    };

    
    @GetMapping("")
    public String songs(Model model) {
        
        model.addAttribute("elements", songs);
        model.addAttribute("linkElement", "songs");
        
        return "show-elements";
    }
    
    @GetMapping("/{id}")
    public String song(Model model, @PathVariable("id") int id) {
        
        Song singleSong = null;

        for (Song song : songs) {
            if(song.getId() == id){
                singleSong = song;
                break;
            }
        }

        model.addAttribute("song", singleSong);
        
        return "song";
    }
}
