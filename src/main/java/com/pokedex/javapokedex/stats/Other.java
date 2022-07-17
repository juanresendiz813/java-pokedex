
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
    "dream_world",
    "home",
    "official-artwork"
})
@Generated("jsonschema2pojo")
public class Other {

    @JsonProperty("dream_world")
    private DreamWorld dreamWorld;
    @JsonProperty("home")
    private Home home;
    @JsonProperty("official-artwork")
    private OfficialArtwork officialArtwork;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dream_world")
    public DreamWorld getDreamWorld() {
        return dreamWorld;
    }

    @JsonProperty("dream_world")
    public void setDreamWorld(DreamWorld dreamWorld) {
        this.dreamWorld = dreamWorld;
    }

    @JsonProperty("home")
    public Home getHome() {
        return home;
    }

    @JsonProperty("home")
    public void setHome(Home home) {
        this.home = home;
    }

    @JsonProperty("official-artwork")
    public OfficialArtwork getOfficialArtwork() {
        return officialArtwork;
    }

    @JsonProperty("official-artwork")
    public void setOfficialArtwork(OfficialArtwork officialArtwork) {
        this.officialArtwork = officialArtwork;
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
