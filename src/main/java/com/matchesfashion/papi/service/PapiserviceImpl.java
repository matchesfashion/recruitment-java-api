package com.matchesfashion.papi.service;

import com.matchesfashion.papi.domain.Product;
import com.matchesfashion.papi.exceptions.NoItemFoundException;
import com.matchesfashion.papi.model.request.PapiRequest;
import com.matchesfashion.papi.model.response.PapiResponse;
import com.matchesfashion.papi.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PapiserviceImpl implements Papiservice {

    private List<PapiResponse> papiResponses = new ArrayList();

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<PapiResponse> getItemsFromDatabase(PapiRequest papiRequest) {

        papiResponses.clear();

        List<Product> productRepositoryFiltered = this.findAll().stream()
                .filter(e -> e.getPrice() > Integer.valueOf(papiRequest.getCostAbove()))
                .collect(Collectors.toList());

        if(productRepositoryFiltered.size() == 0){
            log.info(papiRequest.toString());
            throw new NoItemFoundException("No item above " + papiRequest.getCostAbove() + " cost found.");
        }

        productRepositoryFiltered.forEach(this::createPapiResponseList);

        return papiResponses;
    }

    @Override
    public List<PapiResponse> getAllItemsFromDatabase(){
        papiResponses.clear();

        this.findAll().forEach(this::createPapiResponseList);

        return papiResponses;

    }

    private List<Product> findAll(){
        return productRepository.findAll();
    }

    private void createPapiResponseList(Product product) {

        papiResponses.add(PapiResponse.builder()
                .category(product.getCategory())
                .id(product.getId())
                .price(product.getPrice())
                .title(product.getTitle())
                .build());
    }
}
