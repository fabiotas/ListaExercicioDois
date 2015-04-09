package br.com.exercicio.lista;

import java.util.*;

public class ExercicioNove extends ExercicioUm {
	
	public static void main(String[] args) {
		
		Scanner tecla = new Scanner(System.in);
		ExercicioNove exer = new ExercicioNove();
		String nome;
		
		
		System.out.println("Insira o nome do Aluno: ");
		nome = tecla.nextLine();
		int resul, nota1 = exer.Output("Insira a primeira nota: ");
		int nota2 = exer.Output("Insira a segunda nota: ");
		int nota3 = exer.Output("Insira a terceira nota: ");
				
		
		int quantfalta = exer.Output("Insira a quantidade de falta: ");
		
		resul = (nota1+nota2+nota3)/3;
		
		if(resul >= 7){
			resul = (100 / 80) * quantfalta;
			if(resul < 25){
				System.out.println("O Aluno "+nome+" esta aprovado.");
			}else{
				System.out.println("O Aluno "+nome+" esta reprovado por falta");
			}
		}else{
			System.out.println("Aluno "+nome+" esta reprovado por nota.");
		}
		
	}

}
