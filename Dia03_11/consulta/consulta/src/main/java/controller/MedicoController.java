package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import model.Medico;
import service.MedicoService;

@RestControllerAdvice
@RequestMapping(path = "/medico")
public class MedicoController {
	@Autowired
	private MedicoService medicoService;

	@GetMapping
	public List<Medico> findAll() {
		return this.medicoService.findAll();
}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Medico> findById(@PathVariable String id) {
		Medico obj = this.medicoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Medico criar(@RequestBody Medico medico) {
		return this.medicoService.create(medico);
	}

}
