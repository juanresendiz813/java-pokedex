package com.pokedex.javapokedex;

import com.pokedex.javapokedex.stats.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
@Component
public class PokemonSearch implements PokemonInterface{

    private List<Result> pokeLandingList = new ArrayList<Result>();

    @Autowired
    public PokemonSearch(){return;}

    private List<Result> getLandingList(){
        final String uri = "https://pokeapi.co/api/v2/pokemon/?limit=151";
        RestTemplate restTemplate = new RestTemplate();
        Pokemon orignal = restTemplate.getForObject(uri, Pokemon.class);
        pokeLandingList = orignal.getResults();
        return pokeLandingList;
    }

    public List<Result> landingList(){
        return getLandingList();
    }

    private PokemonStats searchPokemon(Result name){
        final String uri = "https://pokeapi.co/api/v2/pokemon/"+name.getName();
        RestTemplate restTemplate = new RestTemplate();
        PokemonStats pokemonStats = restTemplate.getForObject(uri, PokemonStats.class);

        return pokemonStats;
    }

    public PokemonStats getPokemon(Result name){return searchPokemon(name);}
}
