package org.learning.bestofthe.controller;

import org.learning.bestofthe.Movie;
import org.learning.bestofthe.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home(Model model){

        String myName = "Julie Kaam";
        model.addAttribute("subtitle", myName);
        // ritorna una stringa che è il nome del template che si trova in resources/templates
        return "home";}

        @GetMapping("/movies")
        public  String movie(Model model){


            List<Movie> movies = getBestMovies();
            // aggiungo la lista al model come attributo
            model.addAttribute("Movies", movies);

            return "movie";
        }

       @GetMapping("/songs")
        public  String song(Model model){

           List<Song> songs = getBestSongs();
           // aggiungo la lista al model come attributo
           model.addAttribute("Songs", songs);

           return "song";

        }

        private List<Movie> getBestMovies(){
            List<Movie> movies=new ArrayList<>();
            movies.add(new Movie(45,"broke"));
            movies.add(new Movie(12,"love"));
            movies.add(new Movie(25,"peace"));
            movies.add(new Movie(5,"work-hard"));
            return movies;
        }
        private  List<Song> getBestSongs(){
            List<Song> songs=new ArrayList<>();
            songs.add(new Song(100,"fall in love"));
            return songs;
        }
    }



