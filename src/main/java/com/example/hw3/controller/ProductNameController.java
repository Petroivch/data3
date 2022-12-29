package com.example.hw3.controller;

import com.example.hw3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductNameController {

    private final ProductService productService;

    @GetMapping("/fetch-product")
    public List<String> fetchProduct(@RequestParam("name") String name) {
        return productService.getProductName(name);
    }
}