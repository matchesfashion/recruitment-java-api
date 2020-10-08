package com.matchesfashion.papi.controller;

import com.matchesfashion.papi.model.request.PapiRequest;
import com.matchesfashion.papi.model.response.PapiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface Controller {

    @GetMapping(path = "/getItems")
    ResponseEntity<List<PapiResponse>> getItemsFromDB(@RequestParam(required = false) String title,
                                                      @RequestParam(required = false) String category,
                                                      @RequestParam(required = false) Integer price,
                                                      @RequestParam(required = false, defaultValue = "100") String costAbove);

    @PostMapping(path = "/addItem")
    ResponseEntity addItemtoDatabase(@RequestBody PapiRequest papiRequest);

    @PostMapping(path = "/updateItem")
    ResponseEntity updateItemInDatabase();

    @DeleteMapping(path = "/deleteItem")
    ResponseEntity deleteItemFromDB();
}
