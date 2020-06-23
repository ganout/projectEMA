package com.wildcodeschool.projectEMA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("character/2")
    public String getCharacter(Model model) {

        String url = "https://rickandmortyapi.com/api/";

        WebClient webClient = WebClient.create(url);

        Mono<Character> call = webClient.get()
                .retrieve()
                .bodyToMono(Character.class);
        Character character = call.block();

        model.addAttribute("character", character);
        return "index";
    }

}

