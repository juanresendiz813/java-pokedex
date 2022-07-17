
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
    "omegaruby-alphasapphire",
    "x-y"
})
@Generated("jsonschema2pojo")
public class GenerationVi {

    @JsonProperty("omegaruby-alphasapphire")
    private OmegarubyAlphasapphire omegarubyAlphasapphire;
    @JsonProperty("x-y")
    private XY xY;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("omegaruby-alphasapphire")
    public OmegarubyAlphasapphire getOmegarubyAlphasapphire() {
        return omegarubyAlphasapphire;
    }

    @JsonProperty("omegaruby-alphasapphire")
    public void setOmegarubyAlphasapphire(OmegarubyAlphasapphire omegarubyAlphasapphire) {
        this.omegarubyAlphasapphire = omegarubyAlphasapphire;
    }

    @JsonProperty("x-y")
    public XY getxY() {
        return xY;
    }

    @JsonProperty("x-y")
    public void setxY(XY xY) {
        this.xY = xY;
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
