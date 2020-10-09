package com.matchesfashion.papi.controller;

import com.matchesfashion.papi.model.request.PapiRequest;
import com.matchesfashion.papi.model.response.PapiResponse;
import com.matchesfashion.papi.service.Papiservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PapiControllerImpl implements Controller {

    private Papiservice papiservice;

    public PapiControllerImpl(Papiservice papiservice) {
        this.papiservice = papiservice;
    }

    @Override
    public ResponseEntity<List<PapiResponse>> getItemsFromDB(String title, String category, Integer price, String costAbove) {

        return new ResponseEntity(papiservice.getItemsFromDatabase(PapiRequest.builder()
                .category(category)
                .costAbove(costAbove)
                .price(price)
                .title(title)
                .build()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity addItemtoDatabase(@RequestBody PapiRequest papiRequest) {

        return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
    }

    @Override
    public ResponseEntity updateItemInDatabase() {
        return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
    }

    @Override
    public ResponseEntity deleteItemFromDB() {
        return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
    }
}
