package com.dda.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dda.entity.DatabaseSequence;
@Repository
public interface DatabaseSequenceRepository extends MongoRepository<DatabaseSequence, String>{

}
