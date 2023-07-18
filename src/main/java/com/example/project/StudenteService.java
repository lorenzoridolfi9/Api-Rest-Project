package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudenteService {
	
	@Autowired
	private StudenteMapper studenteMapper;

	
	public StudenteService(StudenteMapper studenteMapper) {
		this.studenteMapper = studenteMapper;
	}
	
	//Insert
	public void saveStudente(Studenti studente) {
		studenteMapper.insertStudente(studente);
		
	}
	
	//Read Once
	public Studenti getStudenteById(int id) {
		return studenteMapper.getStudenteById(id);
	}
	
	//Read All
	public List<Studenti> getAll(){
		return studenteMapper.getAllStudenti();
	}
	
	//Update
	public void updateStudente(Studenti studente) {
		studenteMapper.updateStudente(studente);
	}
	
	//Delete
	public void deleteStudente(int id) {
		studenteMapper.deleteStudente(id);
		
	}
	

}
