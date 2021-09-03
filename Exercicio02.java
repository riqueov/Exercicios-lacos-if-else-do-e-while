package exercicios.tres;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) throws InterruptedException {
		Scanner leia = new Scanner(System.in);
		int n =0, par = 0, impar = 0;
		System.out.println("Digite 10 numeros: ");
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite um numero: ");
			n = leia.nextInt();
			
			
			if(n % 2 == 0) {
				par++;
			}else {
				impar++;;
			}	
			
		}
		System.out.println("Foram: \nPares: " + par + "\nImpares " +impar);
		leia.close();
	}

}
