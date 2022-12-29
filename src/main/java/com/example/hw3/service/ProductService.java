package com.example.hw3.service;


import com.example.hw3.repository.ProductNameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductNameRepository productNameRepository;

    public List<String> getProductName(String name) {
        return productNameRepository.getProductName(name);
    }
}