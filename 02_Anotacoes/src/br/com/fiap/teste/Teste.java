package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacoes.Coluna;
import br.com.fiap.beans.Animal;

public class Teste {

	public static void main(String[] args) {
		// INSTANCIAR UM ANIMAL
		Animal coala = new Animal();

		// API REFLECTION: RECUPERA TODA A ESTRUTURA DA CLASSE
		// EXIBIR O NOME DA CLASSE
		System.out.println(coala.getClass().getName());

		// RECUPERAR OS MÉTODOS DA CLASSE ANIMAL
		System.out.println("Métodos:");
		Method[] metodos = coala.getClass().getDeclaredMethods();
		for (Method m : metodos) {
			System.out.println(m.getName());
		}

		// RECUPERA OS ATRIBUTOS DA CLASSE ANIMAL
		System.out.println("Atributos:");
		Field[] atributos = coala.getClass().getDeclaredFields();
		for (int i = 0; i < atributos.length; i++) {
			System.out.println(atributos[i].getName());
			//RECUPERAR A ANOTAÇÃO @Coluna
			Coluna a = atributos[i].getAnnotation(Coluna.class);
			System.out.println("Campo: "+ a.nome());
			System.out.println("Obrigatório: "+a.nullable());
			
		}

	}
}
