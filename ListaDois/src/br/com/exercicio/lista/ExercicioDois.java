package br.com.exercicio.lista;

public class ExercicioDois extends ExercicioUm {
	
	public static void main(String[] args) {
	
		
		ExercicioDois exer = new ExercicioDois();
		
		
		int num1 = exer.Output("Insira um numero : ");
		
		if(num1%2 == 0){
			System.out.println("Numero par");
		}else{
			System.out.println("Numero impar");
		}
		
		
	}

}
