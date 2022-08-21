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
    public String index(Model model, RedirectAttributes attributes) {
        if(!model.containsAttribute("partials")){
            model.addAttribute("partials", "landing");
            model.addAttribute("poke", pi.landingList());
            model.addAttribute("pokemon", new Result());
            model.addAttribute("pageTitle", "The Jave Pokedex");
            return "index";
        }

        return "index";
    }

    @RequestMapping(value = "/Pokemon", method = {RequestMethod.POST})
    public String pokemon(@ModelAttribute("pokemon") Result name, BindingResult userBindingResult, RedirectAttributes attributes) throws Exception {
        PokemonStats pokemonStats = pi.getPokemon(name);
        List<Result> q = pi.getRandomPokemon();
        if (pokemonStats.getId() != null) {
//            List<Result> q = pi.getRandomPokemon();
            List<Type__1> type__1 = new ArrayList<>();
            for (Type e : pokemonStats.getTypes()){
                type__1.add(e.getType());
            }
            List<Ability__1> ability__1 = new ArrayList<>();
            for (Ability e : pokemonStats.getAbilities()){
                ability__1.add(e.getAbility());
            }
            List<Move__1> move__1 = new ArrayList<>();
            for (Move e : pokemonStats.getMoves()){
                move__1.add(e.getMove());
            }
            attributes.addFlashAttribute("partials", "results");
            attributes.addFlashAttribute("t", type__1);
            attributes.addFlashAttribute("a", ability__1);
            attributes.addFlashAttribute("m", move__1);


        } else {
            attributes.addFlashAttribute("partials", "noPoke");
            attributes.addFlashAttribute("poke", pi.landingList());
        }

        attributes.addFlashAttribute("pokeStats", pokemonStats);
        attributes.addFlashAttribute("randPoke", q);
        attributes.addFlashAttribute("pageTitle", "The Jave Pokedex");
        attributes.addFlashAttribute("pokemon", new Result());

        return "redirect:/";
    }

}
