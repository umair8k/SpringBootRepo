package com.dda.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dda.entity.City;


@Repository
public interface CityRepository extends MongoRepository<City, Integer> {

}
