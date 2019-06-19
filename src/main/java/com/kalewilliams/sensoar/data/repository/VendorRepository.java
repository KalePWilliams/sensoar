package com.kalewilliams.sensoar.data.repository;

import com.kalewilliams.sensoar.data.entity.Vendor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends CrudRepository<Vendor,Integer> {
    Vendor findByVendorId(String number); //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
}
