package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import model.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String>{

}
