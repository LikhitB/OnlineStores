package com.onlinestore.service;

import java.util.List;

import com.onlinestore.model.Product;
import com.onlinestore.model.ProductDTO;


public interface ProductService {

    public void createProduct(Product product);

    public List<ProductDTO> getAllProducts();

    public ProductDTO getProductById(String id);

}
