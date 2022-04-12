package com.pokedex.javapokedex;

import org.apache.commons.codec.Charsets;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;


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

        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(uri);
        HttpResponse response = null;
        try {
            response = client.execute(request);
            HttpEntity entity = response.getEntity();
            Header encodingHeader = entity.getContentEncoding();
            // you need to know the encoding to parse correctly
            Charset encoding = encodingHeader == null ? StandardCharsets.UTF_8 :
                    Charsets.toCharset(encodingHeader.getValue());
            // use org.apache.http.util.EntityUtils to read json as string
            String json = EntityUtils.toString(entity, StandardCharsets.UTF_8);
            JSONObject o = new JSONObject(json);
            List<String> list = new ArrayList<String>();
            JSONArray ability = o.getJSONArray("held_items");
            for(int i = 0 ; i < ability.length() ; i++) {
                try {
                    list.add(ability.getJSONObject(i).getString("item"));
                    return list.toString();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return response.toString();
    };

}
