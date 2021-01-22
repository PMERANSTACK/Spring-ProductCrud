package com.crudproduct.crudImplementation.repository;

import com.crudproduct.crudImplementation.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    boolean existsById(String id);
    Product findByName(String name);
}
