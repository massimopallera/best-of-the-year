package org.lessons.java.boty.controllers;
import org.lessons.java.boty.classes.Movie;
import org.lessons.java.boty.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping("/")
    public String index(Model model, @RequestParam(name = "name") String name){
        
        model.addAttribute("name", name.substring(0,1).toUpperCase() + name.substring(1));
        
        return "index";
    }

    private String getBestMovies(){
        Movie[] films = new Movie[]{
            new Movie(1, "Inception"),
            new Movie(2, "The Dark Knight"),
            new Movie(3, "Interstellar"),
            new Movie(4, "Pulp Fiction"),
            new Movie(5, "The Matrix"),
            new Movie(6, "Forrest Gump"),
            new Movie(7, "The Godfather"),
            new Movie(8, "Fight Club"),
            new Movie(9, "The Shawshank Redemption"),
            new Movie(10, "Gladiator")
        };

        String str = "";

        for(int i = 0; i < films.length; i++){
            str += films[i].getMovie() + (i < films.length-1 ? ", " : "");
        }

        return str;
    };

    private String getBestSongs(){
         // Array di canzoni
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

        String str = "";

        for(int i = 0; i < songs.length; i++){
            str += songs[i].getSong() + (i < songs.length-1 ? ", " : "");
        }

        return str;
    };


    @GetMapping("/movies")
    public String movies(Model model) {
        
        model.addAttribute("movies", getBestMovies());
        
        return "movies";
    }
    
    @GetMapping("/songs")
    public String songs(Model model) {
        
        model.addAttribute("songs", getBestSongs());
        
        return "songs";
    }
    

}
