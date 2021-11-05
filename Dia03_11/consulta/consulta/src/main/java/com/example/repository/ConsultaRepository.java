package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Consulta;


@Repository
public interface ConsultaRepository extends MongoRepository<Consulta, String> {

}
