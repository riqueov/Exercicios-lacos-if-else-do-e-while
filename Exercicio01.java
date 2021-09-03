package exercicios.tres;

public class Exercicio01 {

	public static void main (String[] Args) throws InterruptedException {

		
		for(int i = 1000; i <= 1999; i++) {
			if(i % 11 == 5) {
				System.out.println("Entre 1000 e 1999, os numeros que tem resto 5 são: " + i);
				Thread.sleep(200);
			}
		}
	}
}
