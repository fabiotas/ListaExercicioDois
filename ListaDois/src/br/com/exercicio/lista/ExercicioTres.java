package br.com.exercicio.lista;

public class ExercicioTres extends ExercicioUm {

	public static void main(String[] args) {
		
		ExercicioTres exer = new ExercicioTres();
		
		int num1 = exer.Output("Insira o primeiro numero: ");
		int num2 = exer.Output("Insira o segundo numero: ");
		
		if(num1%num2 == 0){
			System.out.println("O primeiro numero é divisivel pelo Segundo.");
		}else{
			System.out.println("O primeiro numero não é divisivel pelo Segundo.");
		}
		
	}
	
}
