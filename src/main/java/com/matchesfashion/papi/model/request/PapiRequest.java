package com.matchesfashion.papi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class PapiRequest {

    @JsonProperty("title")
    private String title;

    @JsonProperty("category")
    private String category;

    @JsonProperty("price")
    private Integer price;

    @JsonProperty("costAbove")
    private String costAbove;

    @Override
    public String toString() {
        return  title + "\n" +
                category + "\n" +
                price + "\n" +
                costAbove;
    }

}
