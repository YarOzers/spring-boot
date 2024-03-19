package com.example.demo.repositories;

import com.example.demo.models.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee,String> {
}
