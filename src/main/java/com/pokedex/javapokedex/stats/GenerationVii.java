
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
    "icons",
    "ultra-sun-ultra-moon"
})
@Generated("jsonschema2pojo")
public class GenerationVii {

    @JsonProperty("icons")
    private Icons icons;
    @JsonProperty("ultra-sun-ultra-moon")
    private UltraSunUltraMoon ultraSunUltraMoon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("icons")
    public Icons getIcons() {
        return icons;
    }

    @JsonProperty("icons")
    public void setIcons(Icons icons) {
        this.icons = icons;
    }

    @JsonProperty("ultra-sun-ultra-moon")
    public UltraSunUltraMoon getUltraSunUltraMoon() {
        return ultraSunUltraMoon;
    }

    @JsonProperty("ultra-sun-ultra-moon")
    public void setUltraSunUltraMoon(UltraSunUltraMoon ultraSunUltraMoon) {
        this.ultraSunUltraMoon = ultraSunUltraMoon;
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
