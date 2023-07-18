package com.example.project;

import java.time.LocalDate;

public class Studenti {
	
	private int id;
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	private String corsiDiLaurea;
	private String città;
	
	//Constructor
	public Studenti(int id, String nome, String cognome, LocalDate dataDiNascita, String corsiDiLaurea, String città) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.corsiDiLaurea = corsiDiLaurea;
		this.città = città;
	}
	
	//Generate Getter and Setters methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getCorsoDiLaurea() {
		return corsiDiLaurea;
	}

	public void setCorsoDiLaurea(String corsoDiLaurea) {
		this.corsiDiLaurea = corsoDiLaurea;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}
	
	
	//Generate ToString methods
	@Override
	public String toString() {
		return "Studenti [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita
				+ ", corsoDiLaurea=" + corsiDiLaurea + ", città=" + città + "]";
	}
	
		

}
