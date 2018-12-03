package edu.csumb.cst438.productdb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


import edu.csumb.cst438.productdb.entities.Users;

@Repository
public interface IUsersRepository extends MongoRepository<Users, String> {
    @Query (value = "{'id':?0}")   
    Users findByRepoId(String id);
}