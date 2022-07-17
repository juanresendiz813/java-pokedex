
package com.pokedex.javapokedex.stats;

import java.util.HashMap;
import java.util.List;
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
    "move",
    "version_group_details"
})
@Generated("jsonschema2pojo")
public class Move {

    @JsonProperty("move")
    private Move__1 move;
    @JsonProperty("version_group_details")
    private List<VersionGroupDetail> versionGroupDetails = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("move")
    public Move__1 getMove() {
        return move;
    }

    @JsonProperty("move")
    public void setMove(Move__1 move) {
        this.move = move;
    }

    @JsonProperty("version_group_details")
    public List<VersionGroupDetail> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    @JsonProperty("version_group_details")
    public void setVersionGroupDetails(List<VersionGroupDetail> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
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
