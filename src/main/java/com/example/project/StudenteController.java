package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/studenti")
public class StudenteController {
	
	@Autowired
	StudenteService studenteService;

	
	public StudenteController(StudenteService studenteService) {
		this.studenteService = studenteService;
	}
	
	@PostMapping
	public void saveStudente(@RequestBody Studenti studente) {
		studenteService.saveStudente(studente);
	}
	
	@GetMapping("/{id}")
	public Studenti getStudenteById(@PathVariable int id ) {
		return studenteService.getStudenteById(id);
	}
	
	@GetMapping
	public List<Studenti> getAll() {
		return studenteService.getAll();
	}
	
	@PutMapping("/{id}")
	public void updateStudente(@PathVariable int id, @RequestBody Studenti studente) {
		studente.setId(id);
		studenteService.updateStudente(studente);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudente(@PathVariable int id) {
		studenteService.deleteStudente(id);
	}

}
