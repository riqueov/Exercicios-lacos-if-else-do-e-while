package exercicios.tres;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, soma = 0;
		
		System.out.println("### Olá! Os numeros serão somados, para sair digite 0 ###" );
		
			 do { 
				 System.out.print("Digite um numero: ");
				 n = leia.nextInt();
				 soma = soma + n;
				 
			 } while(n != 0);
			 
			
			leia.close();
			
			
			System.out.print("A soma dos numeros é: " + soma);	
					
	}

}
