package com.kalewilliams.sensoar.data.repository;

import com.kalewilliams.sensoar.data.entity.Parts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsRepository extends CrudRepository<Parts, Integer> {
    Parts findByPartId(String number);
}
