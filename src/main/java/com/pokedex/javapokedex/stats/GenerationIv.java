
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
    "diamond-pearl",
    "heartgold-soulsilver",
    "platinum"
})
@Generated("jsonschema2pojo")
public class GenerationIv {

    @JsonProperty("diamond-pearl")
    private DiamondPearl diamondPearl;
    @JsonProperty("heartgold-soulsilver")
    private HeartgoldSoulsilver heartgoldSoulsilver;
    @JsonProperty("platinum")
    private Platinum platinum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("diamond-pearl")
    public DiamondPearl getDiamondPearl() {
        return diamondPearl;
    }

    @JsonProperty("diamond-pearl")
    public void setDiamondPearl(DiamondPearl diamondPearl) {
        this.diamondPearl = diamondPearl;
    }

    @JsonProperty("heartgold-soulsilver")
    public HeartgoldSoulsilver getHeartgoldSoulsilver() {
        return heartgoldSoulsilver;
    }

    @JsonProperty("heartgold-soulsilver")
    public void setHeartgoldSoulsilver(HeartgoldSoulsilver heartgoldSoulsilver) {
        this.heartgoldSoulsilver = heartgoldSoulsilver;
    }

    @JsonProperty("platinum")
    public Platinum getPlatinum() {
        return platinum;
    }

    @JsonProperty("platinum")
    public void setPlatinum(Platinum platinum) {
        this.platinum = platinum;
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
