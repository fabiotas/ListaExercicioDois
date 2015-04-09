package br.com.exercicio.lista;

import java.util.Scanner;

public class ExercicioSete {

	public float RetornarFloat(int numero){
		Scanner tecla = new Scanner(System.in);		
		System.out.println("Insira "+numero+"° numero: ");
		return tecla.nextFloat();
	}
	
	public static void main(String[] args) {
		int opc = 1;
		while(opc != 0){
			
		
		ExercicioSete exer = new ExercicioSete();
		Scanner teclado = new Scanner(System.in);
		
		float numero1, numero2, numero3;
		
		numero1 = exer.RetornarFloat(1);
		numero2 = exer.RetornarFloat(2);
		numero3 = exer.RetornarFloat(3);
		
		if(numero1 == numero2 && numero1 == numero3){
			System.out.println("Triangulo Equilatero.");
		}else if(numero1 == numero2 && numero1 != numero3 || numero2 == numero3 && numero2 != numero1 || numero1 == numero3 && numero1 != numero2){
			System.out.println("Triangulo isósceles.");
		}else if(numero1 != numero2 && numero1 != numero3 && numero2 != numero3){
			System.out.println("Triangulo Escaleano.");
		}
		System.out.println("Deseja criar um novo triangulo? 1-Sim 0-Não");
		opc = teclado.nextInt();
		}
		
	}
	
}
