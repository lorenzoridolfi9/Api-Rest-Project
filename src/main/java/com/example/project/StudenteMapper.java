package com.example.project;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudenteMapper {
	
	//Create
	void insertStudente(Studenti studente);
	
	//Read One
	Studenti getStudenteById(int id);
	
	//Read All
	List<Studenti> getAllStudenti();
	
	//Update
	void updateStudente(Studenti studente);
	
	//Delete
	void deleteStudente(int id);

}
