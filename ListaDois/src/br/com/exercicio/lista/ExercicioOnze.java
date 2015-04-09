package br.com.exercicio.lista;

import java.util.*;

public class ExercicioOnze {
	
	public double RetornaValor(double valor){
		
		if(valor >= 20.0){
			valor = valor + (valor * 0.30);
			return valor;
		}else{
			valor = valor +(valor * 0.45);
			return valor;
		}
		
	}
	
	
	public static void main(String[] args) {
		
	int opc = 0;
		
	while(opc == 0){
		ExercicioOnze  exer = new ExercicioOnze();
		Scanner tecla  = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto: ");
		double valorInfo = tecla.nextDouble();	 
		double valorfinal = exer.RetornaValor(valorInfo);
		
		System.out.println("O resultado é: "+valorfinal);
		
		System.out.println("Deseja fazer uma nova consulta? 0-sim 1-não");
		opc = tecla.nextInt();
	}
	}
}
