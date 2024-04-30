package com.ecomerce.api.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.api.demo.models.ProductModel;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long> {

}
