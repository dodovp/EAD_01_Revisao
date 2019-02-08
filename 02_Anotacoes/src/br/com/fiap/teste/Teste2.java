package br.com.fiap.teste;

import br.com.fiap.anotacoes.Tabela;
import br.com.fiap.beans.Disney;

public class Teste2 {
	public static void main(String[] args) {
		Disney mickey=new Disney();
		//RECUPERA A ANOTAÇÃO @TABELA
		Tabela anotacao = mickey.getClass().getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM "+anotacao.nome());
	}
}
