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


    //Returns 151 pokemon
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


    //Returns searched pokemon
    private PokemonStats searchPokemon(Result name) throws Exception{
        String ne = name.getName();
        final String uri = "https://pokeapi.co/api/v2/pokemon/"+ne.toLowerCase(Locale.ROOT);
        RestTemplate restTemplate = new RestTemplate();
        try {
            PokemonStats pokemonStats = restTemplate.getForObject(uri, PokemonStats.class);
            return pokemonStats;
        } catch (Exception e){
            PokemonStats pokemonStats = new PokemonStats();
            pokemonStats.setName(ne);
            return pokemonStats;
        }
    }
    public PokemonStats getPokemon(Result name) throws Exception {return searchPokemon(name);}


    //Returns 3 random pokemon
    private List<Result> getRandomList(){
        List<Result> lp = new ArrayList<Result>();
        //Variables
        Pokemon p = new Pokemon();
        List<Pokemon> pl = new ArrayList<>();

        //loops to get results
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(151 - 1) + 1;
            String uri = "https://pokeapi.co/api/v2/pokemon/?offset="+randomNumber+"&limit=1";
            RestTemplate restTemplate = new RestTemplate();
            Pokemon orignal = restTemplate.getForObject(uri, Pokemon.class);
            orignal.getResults().get(0).setAdditionalProperty("rn", randomNumber+1);
            pl.add(orignal);
        }
        for (Pokemon e : pl) {
            for (Result t : e.getResults()){
                lp.add(t);
            }
        }
        //returns results
        return lp;
    }
    public List<Result> getRandomPokemon(){return getRandomList();}

}
