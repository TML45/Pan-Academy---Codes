package com.example.consulta.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.consulta.model.Consulta;


@Repository
public interface ConsultaRepository extends MongoRepository<Consulta, String> {	

}
