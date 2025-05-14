package com.onlinestore.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.query.StringBasedMongoQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinestore.model.Product;
import com.onlinestore.model.ProductDTO;
import com.onlinestore.service.ProductService;

import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping
    public void createProduct(@RequestBody Product product) {
           service.createProduct(product);
    }
    @GetMapping
    public List<ProductDTO> getAllProducts() {
        return service.getAllProducts();
    }
    @GetMapping("/id")
    public ProductDTO getProductById(@RequestParam String id) {
        return service.getProductById(id);
    }
    
    

}
