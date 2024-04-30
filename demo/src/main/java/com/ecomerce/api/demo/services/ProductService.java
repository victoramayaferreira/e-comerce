package com.ecomerce.api.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.api.demo.models.ProductModel;
import com.ecomerce.api.demo.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> getAllProducts() {
        return (List<ProductModel>) productRepository.findAll();
    }

    public ProductModel saveProduct(ProductModel product) {
        return productRepository.save(product);
    }

    public Optional<ProductModel> getById(Long id) {
        return productRepository.findById(id);
    }

    public ProductModel updateById(ProductModel request, Long id) {
        ProductModel product = productRepository.findById(id).get();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
