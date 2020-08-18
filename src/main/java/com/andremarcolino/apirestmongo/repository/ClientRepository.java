package com.andremarcolino.apirestmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andremarcolino.apirestmongo.domain.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {

}
