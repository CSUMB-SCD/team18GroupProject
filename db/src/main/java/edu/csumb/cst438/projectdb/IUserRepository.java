package edu.csumb.cst438.projectdb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


import edu.csumb.cst438.projectdb.entities.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {
    @Query (value = "{'id':?0}")   
    User findByRepoId(String id);

    @Query (value = "{'username':?0}")   
    User findByUsername(String username);
}