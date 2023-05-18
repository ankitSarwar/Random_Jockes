package com.example.RandomJokes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JokesController {

    static ArrayList<String>jokesList=new ArrayList<>();

    @PostMapping(value="/jokes")
    public String saveJokes(@RequestBody String jokes){
        jokesList.add(jokes);
        return "Jokes saved";
    }

    @GetMapping(value="/jokes")// http://localhost:8082/jokes
    public String getJokes(){

        jokesList.add("Did you hear about the mathematician who’s afraid of negative numbers?\n"+"\n"+"He’ll stop at nothing to avoid them.");
        jokesList.add("Why do we tell actors to “break a leg?”\n"+"\n"+"Because every play has a cast. Here are some dark jokes to check out if you have a morbid sense of humor.");
        jokesList.add("Yesterday I saw a guy spill all his Scrabble letters on the road. I asked him, “What’s the word on the street?”\n"+"\n"+"Once my dog ate all the Scrabble tiles. For days he kept leaving little messages around the house. Don’t miss these hilarious egg puns that will absolutely crack you up.");
        jokesList.add("Knock! Knock!\n" +
                "Who’s there?\n" +
                "Control Freak.\n"+"\n"+"Con…\n" +
                "OK, now you say, “Control Freak who?” ");
        jokesList.add("Hear about the new restaurant called Karma?\n"+"\n"+"There’s no menu: You get what you deserve.");



        int randomNumber= 0+(int)(Math.random()*((jokesList.size()-0)+1));
        return jokesList.get(randomNumber);
    }
}
