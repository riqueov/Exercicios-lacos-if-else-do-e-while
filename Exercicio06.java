package exercicios.tres;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, soma = 0, cont = 0, media;
		
		System.out.println("### Olá! Vamos encontrar numeros multiplos de 3? Para sair basta digitar 0 ###" );
		
			 do { 
				 System.out.print("Digite um numero: ");
				 n = leia.nextInt();
				 
				 if(n % 3 == 0) {
					 cont = cont + 1;
					 soma = soma + n;
				 }
				 
			 } while(n != 0);
			 
			media = soma / (cont-1);
			leia.close();
			
			
			System.out.print("O total dos multiplos de 3 é de: " + soma + "\nA média dos numeros é: " + media);	
					
	}


}
