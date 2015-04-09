package br.com.exercicio.lista;

public class ExercicioCinco extends ExercicioUm {

	public static void main(String[] args) {
		
		ExercicioCinco exer = new ExercicioCinco();
		
		int valor1 = exer.Output("Insira o primeiro numero: ");
		int valor2 = exer.Output("Insira o segundo numero: ");
		
		if(valor1 > valor2){
			int B = valor1, A = valor2;
			System.out.println("Variavel A: "+A+" Variavel B: "+B);
		}else{
			int A = valor1, B = valor2;
			System.out.println("Variavel A: "+A+" Variavel B: "+B);
		}
	}
	
}
