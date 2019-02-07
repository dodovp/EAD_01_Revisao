package br.com.fiap.beans;

import java.util.Calendar;

public class Pessoa {
	//CONSTANTE NO JAVA
	public static final char ESPECIE = 'h';
	
	private String nome;
	private Calendar dataNasc;
	private Genero sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Genero getSexo() {
		return sexo;
	}
	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}
}
