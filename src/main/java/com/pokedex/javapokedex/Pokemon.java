package com.pokedex.javapokedex;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;


public class Pokemon {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final String uri = "https://pokeapi.co/api/v2/pokemon/" + name;
        RestTemplate restTemplate = new RestTemplate();
        Object orignal = restTemplate.getForObject(uri, String.class);
        return orignal.toString();
    }



}
