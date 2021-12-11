package com.dda.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dda.entity.SuperAdminEmail;
@Repository
public interface SuperAdminEmailRepository extends MongoRepository<SuperAdminEmail,Integer> {

}
