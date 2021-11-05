package com.example.consulta.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.consulta.model.Medico;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, String>{

}
