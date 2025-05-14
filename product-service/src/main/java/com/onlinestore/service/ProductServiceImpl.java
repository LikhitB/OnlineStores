package com.onlinestore.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinestore.model.Product;
import com.onlinestore.model.ProductDTO;
import com.onlinestore.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public void createProduct(Product product) {
        repo.save(product);
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        List<Product> product = repo.findAll();
        return product.stream().map(this::mapToProductDto).collect(Collectors.toList());

    }

    @Override
    public ProductDTO getProductById(String id) {
        Optional<Product> p = repo.findById(id);
        return mapToProductDto(p.get());

    }

    private ProductDTO mapToProductDto(Product product) {
        return ProductDTO.builder().id(product.getProductId()).name(product.getName()).description(product.getDescription()).price(product.getPrice()).build();
    }

}
