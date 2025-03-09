package org.lessons.java.boty.controllers;
import org.lessons.java.boty.classes.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class MoviesController {
    
    // private String getBestMovies(){
    //     String str = "";

    //     for(int i = 0; i < movies.length; i++){
    //         str += movies[i].getTitle() + (i < movies.length-1 ? ", " : "");
    //     }

    //     return str;
    // };

    Movie[] movies = new Movie[]{
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

    
    @GetMapping("")
    public String movies(Model model) {
        
        model.addAttribute("elements", movies);
        model.addAttribute("linkElement", "movies");
        
        return "show-elements";
    }
    
    @GetMapping("/{id}")
    public String movie(Model model, @PathVariable("id") int id) {
        
        Movie singleMovie = null;
        for (Movie movie : movies) {
            if(movie.getId() == id){
                singleMovie = movie;
                break;
            }
        }

        model.addAttribute("movie", singleMovie);
        
        return "single-movie";
    }
    
}
