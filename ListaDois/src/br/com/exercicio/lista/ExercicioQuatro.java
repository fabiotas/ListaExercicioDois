package br.com.exercicio.lista;

public class ExercicioQuatro extends ExercicioUm {

	public static void main(String[] args) {
		
		ExercicioQuatro exer = new ExercicioQuatro();
		
		int num1 = exer.Output("Insira o primeiro numero: ");
		int num2 = exer.Output("Insira o segundo numero: ");
		
		if(num1 > num2){
			System.out.println("O primeiro numero é maior.");
		}else if(num1 == num2){
			System.out.println("Os numero são iguais.");
		}else{
			System.out.println("O Segundo numero é maior que o primeiro.");
		}
		
	}
	
}
