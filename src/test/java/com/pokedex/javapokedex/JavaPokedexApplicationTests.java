package com.pokedex.javapokedex;

import com.pokedex.javapokedex.stats.Pokemon;
import com.pokedex.javapokedex.stats.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootTest
class JavaPokedexApplicationTests {

    @Test
    void contextLoads() {
        Random random = new Random(152);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            // your code goes here
            int randomNumber = random.nextInt(151 + 1 - 1) + 1;
            list.add(randomNumber);

        }
        System.out.println(list);
    }

    @Test
    void numTest() {
        List<Pokemon> pokeLandingList = new ArrayList<>();
        Random random = new Random(152);
        List<Integer> list = new ArrayList<Integer>();
        List<Result> listResult = new ArrayList<Result>();
        Pokemon x = new Pokemon();
        for (int i = 0; i < 3; i++) {
            // your code goes here
            int randomNumber = random.nextInt(151 );
            list.add(randomNumber);
            String uri = "https://pokeapi.co/api/v2/pokemon/?offset="+randomNumber+"&limit=1";
            RestTemplate restTemplate = new RestTemplate();
            Pokemon orignal = restTemplate.getForObject(uri, Pokemon.class);
            pokeLandingList.add(orignal);
        }
        for (Pokemon e : pokeLandingList) {
            for (Result t : e.getResults()){
                listResult.add(t);
            }
        }
        System.out.println(listResult.toString());
    }
}
