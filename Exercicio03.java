package exercicios.tres;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n = 0;
		int Menor21 = 0;
		int Maior50 = 0;
		
		while(n != -99) {
			System.out.print("Escreva a idade: ");
			n = ler.nextInt();
			if (n <= 23) {
				
				Menor21 ++;
			} else if (n >= 50) {

				Maior50 ++;
			}

		}
		System.out.println((Menor21 - 1) +" pessoas menores de 21 e "+ Maior50 + " maiores de 50");
		ler.close();
	}

}
