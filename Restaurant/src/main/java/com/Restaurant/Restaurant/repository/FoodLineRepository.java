package com.Restaurant.Restaurant.repository;

import com.Restaurant.Restaurant.entity.FoodLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodLineRepository extends CrudRepository<FoodLine, Integer>{

}
