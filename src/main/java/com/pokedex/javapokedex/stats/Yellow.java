
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
    "back_default",
    "back_gray",
    "back_transparent",
    "front_default",
    "front_gray",
    "front_transparent"
})
@Generated("jsonschema2pojo")
public class Yellow {

    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("back_gray")
    private String backGray;
    @JsonProperty("back_transparent")
    private String backTransparent;
    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_gray")
    private String frontGray;
    @JsonProperty("front_transparent")
    private String frontTransparent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("back_default")
    public String getBackDefault() {
        return backDefault;
    }

    @JsonProperty("back_default")
    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    @JsonProperty("back_gray")
    public String getBackGray() {
        return backGray;
    }

    @JsonProperty("back_gray")
    public void setBackGray(String backGray) {
        this.backGray = backGray;
    }

    @JsonProperty("back_transparent")
    public String getBackTransparent() {
        return backTransparent;
    }

    @JsonProperty("back_transparent")
    public void setBackTransparent(String backTransparent) {
        this.backTransparent = backTransparent;
    }

    @JsonProperty("front_default")
    public String getFrontDefault() {
        return frontDefault;
    }

    @JsonProperty("front_default")
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    @JsonProperty("front_gray")
    public String getFrontGray() {
        return frontGray;
    }

    @JsonProperty("front_gray")
    public void setFrontGray(String frontGray) {
        this.frontGray = frontGray;
    }

    @JsonProperty("front_transparent")
    public String getFrontTransparent() {
        return frontTransparent;
    }

    @JsonProperty("front_transparent")
    public void setFrontTransparent(String frontTransparent) {
        this.frontTransparent = frontTransparent;
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
