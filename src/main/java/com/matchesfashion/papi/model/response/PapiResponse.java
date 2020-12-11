package com.matchesfashion.papi.model.response;

import lombok.Builder;
import lombok.ToString;
import lombok.Value;

@Builder
@Value
@ToString
public class PapiResponse {

    private Integer id;
    private String title;
    private String category;
    private Integer price;

}
