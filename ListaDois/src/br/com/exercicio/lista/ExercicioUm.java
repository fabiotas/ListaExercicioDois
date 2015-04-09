package br.com.exercicio.lista;

import java.util.Scanner;

public class ExercicioUm {

	public int Output(String teste){
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println(teste);
		 int valor = tecla.nextInt();
		 return valor;
	}
}
