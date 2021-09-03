package exercicios.tres;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int pessoas = 0, masc = 0, fem = 0, outros = 0; //cont pessoas e generos
		int calmas = 0, nervosas = 0, agressivas = 0; //humor
		int idade, sexo, humor; //categorias
		int nervos40 = 0, calmo18 = 0; //especificos
		int HAgressivos = 0, MNervosas = 0;
		int outrosCalmos = 0; //genero 3 calmos

		while(pessoas < 5) {
		System.out.print("Informe seu genero: \n 1 para Masculino | 2 para Mulher | 3 para Outro : ");
		sexo = leia.nextInt();
		System.out.print("Informe sua idade: ");
		idade = leia.nextInt();
		System.out.print("Informe seu humor: \n 1 para Calmo(a/e) | 2 para Nervoso(a/e) | 3 para Agressiva (a/e) : ");
		humor = leia.nextInt();
		
		if(humor == 1) {
			calmas++;
		}
		if(sexo == 1 && humor == 3) {
			HAgressivos++;
		}
		if(sexo == 2 && humor == 2) {
			MNervosas++;
		}
		if(sexo == 3 && humor == 1) {
			outrosCalmos++;
		}
		if(idade <= 18 && humor == 1) {
			calmo18++;
		}
		if(idade >= 40 && humor == 2) {
			nervos40++;
		}
		
		pessoas++;
		
		}
		
		leia.close();
		
		System.out.println("O numero de pessoas calmas: " + calmas);
		System.out.println("O numero de mulheres nervosas: " + MNervosas);
		System.out.println("O numero de homens agressivos: " + HAgressivos);
		System.out.println("O numero de outros calmos: " + calmo18);
		System.out.println("O numero de pessoas nervosas com mais de 40 anos: " + nervos40);
		System.out.println("O numero de pessoas calmas menores de 18 anos: " + calmo18);
		
	}

}
