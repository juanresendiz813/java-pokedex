package com.pokedex.javapokedex;

import com.pokedex.javapokedex.stats.PokemonStats;
import com.pokedex.javapokedex.stats.Result;

import java.util.List;

public interface PokemonInterface {
    List<Result> landingList();
    PokemonStats getPokemon(Result name);

}
