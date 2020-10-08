package com.matchesfashion.papi.service;

import com.matchesfashion.papi.model.request.PapiRequest;
import com.matchesfashion.papi.model.response.PapiResponse;

import java.util.List;

public interface Papiservice {

    List<PapiResponse> getItemsFromDatabase(PapiRequest papiRequest);
}
