package com.pokedex.javapokedex;

import com.pokedex.javapokedex.stats.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RootController {

    private PokemonInterface pi;

    @Autowired
    public void PokemonSearch(PokemonInterface pokemonInterface) {
        this.pi = pokemonInterface;
    }

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String index(Model model) {
        model.addAttribute("poke", pi.landingList());
        model.addAttribute("pokemon", new Result());
        model.addAttribute("pageTitle", "The Jave Pokedex");
        return "index";
    }

    @RequestMapping(value = "/Pokemon", method = {RequestMethod.POST})
    public String pokemon(Model model, @ModelAttribute("pokemon") Result name, BindingResult userBindingResult) {
        PokemonStats pokemonStats = pi.getPokemon(name);
        List<Type__1> type__1 = new ArrayList<>();
        for (Type e : pokemonStats.getTypes()){
            type__1.add(e.getType());
        }
        List<Move__1> move__1 = new ArrayList<>();
        for (Move e : pokemonStats.getMoves()){
            move__1.add(e.getMove());
        }
        model.addAttribute("poke", pokemonStats);
        model.addAttribute("pageTitle", "The Jave Pokedex");
        model.addAttribute("e", type__1);
        model.addAttribute("d", move__1);

        return "success.html";
    }

}
