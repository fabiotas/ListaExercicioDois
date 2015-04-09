package br.com.exercicio.lista;

import java.util.*;

public class ExercicioDoze {

	public void CalculaSalario(double salario2){
		
		if(salario2 <= 600){
			salario2 = salario2+(salario2 * 0.3);
			System.out.println("O valor do salario com o aumento é: "+ salario2);
		}else if(salario2 > 600.01 && salario2 <= 1100){
			salario2 = salario2+(salario2 * 0.25);
			System.out.println("O valor do salario com o aumento é: "+ salario2);
		}else if(salario2 > 1100.01 && salario2 <= 2400.0){
			salario2 = salario2+(salario2 * 0.20);
			System.out.println("O valor do salario com o aumento é: "+ salario2);
		}else if(salario2 > 2400.01 && salario2 <= 3550.00){
			salario2 = salario2+(salario2 * 0.15);
			System.out.println("O valor do salario com o aumento é: "+ salario2);
		}else if(salario2 > 3550.01){
			salario2 = salario2 + (salario2 * 0.10);
			System.out.println("O valor do salario com o aumento é: "+ salario2);
		}	
		
	}
	
	public static void main(String[] args) {
		
		Scanner tecla = new Scanner(System.in);
		ExercicioDoze exer = new ExercicioDoze();
		int opc;
		
		opc = 0;
		while(opc == 0){
		
			System.out.println("Informe o salario do empregado: ");
			double salario1 = tecla.nextDouble();
		
			 exer.CalculaSalario(salario1);
					
			System.out.println("Deseja fazer uma novo calculo? 0-sim 1-não");
			opc = tecla.nextInt();
			
		}
	}	
	
}
