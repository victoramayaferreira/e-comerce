package com.ecomerce.api.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.api.demo.models.ProductModel;
import com.ecomerce.api.demo.services.ProductService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@Tag(name = "Product", description = "product management endpoints")
@RestController
@RequestMapping(value = "/product")

public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get-all")
    public List<ProductModel> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping()
    public ProductModel save(@RequestBody ProductModel entity) {
        return productService.saveProduct(entity);
    }

    @GetMapping("/{id}")
    public Optional<ProductModel> getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @PutMapping("/{id}")
    public ProductModel updateById(@PathVariable Long id, @RequestBody ProductModel request) {
        return productService.updateById(request, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}

