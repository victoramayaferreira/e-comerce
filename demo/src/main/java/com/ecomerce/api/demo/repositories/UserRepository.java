package com.ecomerce.api.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.api.demo.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

}
