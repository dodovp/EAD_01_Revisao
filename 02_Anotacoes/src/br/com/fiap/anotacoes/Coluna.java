package br.com.fiap.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//MANT�M A ANOTA��O AT� A EXECU��O
@Target(ElementType.FIELD)//ANOTA��O PODE SER UTILIZADA EM ATRIBUTOS
public @interface Coluna {

	String nome();
	
	boolean nullable();
	
}
