package com.wildcodeschool.projectEMA.controller;

import com.wildcodeschool.projectEMA.Entity.CharacterAPI;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("character/{id}")
    public String getCharacter(Model model, @PathVariable Integer id) {

        String url = "https://rickandmortyapi.com/api/character/" + id;

        WebClient webClient = WebClient.create(url);

        Mono<CharacterAPI> call = webClient.get()
                .retrieve()
                .bodyToMono(CharacterAPI.class);
        CharacterAPI character = call.block();

        model.addAttribute("character", character);
        return "index";
    }

    @GetMapping("/character")
    public String caracterRandom(Model model){

        Random random = new Random();
        int id = random.nextInt(591 +1);

        String url = "https://rickandmortyapi.com/api/character/" + id;
        WebClient webClient = WebClient.create(url);

        Mono<CharacterAPI> call = webClient.get()
                .retrieve()
                .bodyToMono(CharacterAPI.class);
        CharacterAPI character = call.block();

        model.addAttribute("character", character);

        return "index";
    }

    // @GetMapping("/characters")
    // public String caracterRandom6(Model model){


    //     int [] idCharacter = {0, 0, 0, 0, 0, 0};

    //     for (int i = 0; i < 6; i++){
    //         Random random = new Random();
    //         int id = random.nextInt(591 +1);
    //         idCharacter[i] = id;
    //     }

    //     String url = "https://rickandmortyapi.com/api/character/" + idCharacter;
    //     WebClient webClient = WebClient.create(url);

    //     Mono<CharacterAPI> call = webClient.get()
    //             .retrieve()
    //             .bodyToMono(CharacterAPI.class);
    //     CharacterAPI character = call.block();

    //     model.addAttribute("characters", character);

    //     return "index";
    // }
   

}

