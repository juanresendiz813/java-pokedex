
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
    "rarity",
    "version"
})
@Generated("jsonschema2pojo")
public class VersionDetail {

    @JsonProperty("rarity")
    private Integer rarity;
    @JsonProperty("version")
    private Version__1 version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rarity")
    public Integer getRarity() {
        return rarity;
    }

    @JsonProperty("rarity")
    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    @JsonProperty("version")
    public Version__1 getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Version__1 version) {
        this.version = version;
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
