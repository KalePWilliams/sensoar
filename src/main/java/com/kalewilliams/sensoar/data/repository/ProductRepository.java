package com.kalewilliams.sensoar.data.repository;

import com.kalewilliams.sensoar.data.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
    default Product findByProductId() {
        return null;
    }
}
