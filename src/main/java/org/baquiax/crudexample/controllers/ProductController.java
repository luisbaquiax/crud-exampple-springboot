package org.baquiax.crudexample.controllers;

import org.baquiax.crudexample.models.Product;
import org.baquiax.crudexample.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    @GetMapping
    public ArrayList<Product> findAll() {
        return productService.getAllProducts();
    }
    @GetMapping(path = "/{id}")
    public Optional<Product> findOne(@PathVariable int id) {
        return productService.getProductById(id);
    }
}
