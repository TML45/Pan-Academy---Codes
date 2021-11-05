package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Medico;


@Repository
public interface MedicoRepository extends MongoRepository<Medico, String>{

}
