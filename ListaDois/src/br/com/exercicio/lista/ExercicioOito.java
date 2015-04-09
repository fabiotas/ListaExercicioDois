package br.com.exercicio.lista;

public class ExercicioOito extends ExercicioUm {
	
	
	public static void main(String[] args) {
	
		ExercicioOito exer = new ExercicioOito();
		
		int numero1 = exer.Output("Insira o primeiro numero");
		int numero2 = exer.Output("Insira o segundo numero");
		int numero3 = exer.Output("Insira o terceiro numero");
		
		
		if(numero1 > numero2 && numero1 > numero3){
			if(numero2>numero3){
				System.out.println(numero3+" "+numero2+" "+numero1);
			}else{
				System.out.println(numero2+" "+numero3+" "+numero1);
			}
		}else if(numero2 > numero1 && numero2 > numero3){
			if(numero1 > numero3){
				System.out.println(numero3+" "+numero1+" "+numero2);
			}else{
				System.out.println(numero1+" "+numero3+" "+numero2);
			}
		}else if(numero3 > numero1 && numero3 > numero2){
			if(numero1 > numero2){
				System.out.println(numero2+" "+numero1+" "+numero3);
			}else{
				System.out.println(numero1+" "+numero2+" "+numero3);
			}
		}
			

	}
}
