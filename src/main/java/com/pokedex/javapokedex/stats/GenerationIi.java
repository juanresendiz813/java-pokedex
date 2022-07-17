
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
    "crystal",
    "gold",
    "silver"
})
@Generated("jsonschema2pojo")
public class GenerationIi {

    @JsonProperty("crystal")
    private Crystal crystal;
    @JsonProperty("gold")
    private Gold gold;
    @JsonProperty("silver")
    private Silver silver;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("crystal")
    public Crystal getCrystal() {
        return crystal;
    }

    @JsonProperty("crystal")
    public void setCrystal(Crystal crystal) {
        this.crystal = crystal;
    }

    @JsonProperty("gold")
    public Gold getGold() {
        return gold;
    }

    @JsonProperty("gold")
    public void setGold(Gold gold) {
        this.gold = gold;
    }

    @JsonProperty("silver")
    public Silver getSilver() {
        return silver;
    }

    @JsonProperty("silver")
    public void setSilver(Silver silver) {
        this.silver = silver;
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
