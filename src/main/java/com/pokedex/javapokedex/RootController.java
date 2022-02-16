package com.pokedex.javapokedex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/")
public class RootController {

    @GetMapping
    public String index(Model model) {

        final String uri = "https://pokeapi.co/api/v2/pokemon/?limit=151";

        RestTemplate restTemplate = new RestTemplate();
        String orignal = restTemplate.getForObject(uri, String.class);


        model.addAttribute("poke", orignal);

        model.addAttribute("allDepartments", List.of("Service", "Admin", "Sales", "Security"));
        //attribute in the form
        model.addAttribute("pokemon", new Pokemon());
        //render simple text
        model.addAttribute("pageTitle", "The Jave Pokedex");
        //if statements
        model.addAttribute("condition", Boolean.FALSE);
        //using switch
        model.addAttribute("role", "manager");
        //to render list
        model.addAttribute("scientists", List.of("Albert Einstein",
                "Niels Bohr",
                "James Clerk Maxwell"));
        System.out.println(orignal);
        return "index";
    }

    //Posted user input
    @RequestMapping(path="/Pokemon",method=RequestMethod.POST)
    public String addPokemon(Pokemon pokemon, Model model) {
        System.out.println(pokemon);
        return "success";
    };

}
