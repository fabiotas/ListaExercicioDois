package br.com.exercicio.lista;

public class ExercicioDez extends ExercicioUm {
	
	public static void main(String[] args) {
		
		ExercicioDez exer = new ExercicioDez();
		
		
		int num1 = exer.Output("Insira um numero: ");
		
		if(num1 > 20 && num1 < 90){
			System.out.println("O numero digitado está entre 20 e 90");
		}else{
			System.out.println("O numero digitado não esta entre 20 e 90");
		}
		
	}

}
