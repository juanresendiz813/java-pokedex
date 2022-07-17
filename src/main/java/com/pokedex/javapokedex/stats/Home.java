
package com.pokedex.javapokedex.stats;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "front_default",
    "front_female",
    "front_shiny",
    "front_shiny_female"
})
@Generated("jsonschema2pojo")
public class Home {

    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_female")
    private Object frontFemale;
    @JsonProperty("front_shiny")
    private String frontShiny;
    @JsonProperty("front_shiny_female")
    private Object frontShinyFemale;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("front_default")
    public String getFrontDefault() {
        return frontDefault;
    }

    @JsonProperty("front_default")
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    @JsonProperty("front_female")
    public Object getFrontFemale() {
        return frontFemale;
    }

    @JsonProperty("front_female")
    public void setFrontFemale(Object frontFemale) {
        this.frontFemale = frontFemale;
    }

    @JsonProperty("front_shiny")
    public String getFrontShiny() {
        return frontShiny;
    }

    @JsonProperty("front_shiny")
    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    @JsonProperty("front_shiny_female")
    public Object getFrontShinyFemale() {
        return frontShinyFemale;
    }

    @JsonProperty("front_shiny_female")
    public void setFrontShinyFemale(Object frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
