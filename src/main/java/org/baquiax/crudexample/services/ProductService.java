package org.baquiax.crudexample.services;

import org.baquiax.crudexample.models.Product;
import org.baquiax.crudexample.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public ArrayList<Product> getAllProducts() {
        return (ArrayList<Product>) productRepository.findAll();
    }
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
}
