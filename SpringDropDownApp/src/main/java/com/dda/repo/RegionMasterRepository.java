package com.dda.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dda.entity.RegionMaster;
@Repository
public interface RegionMasterRepository extends MongoRepository<RegionMaster, Integer> {

}
