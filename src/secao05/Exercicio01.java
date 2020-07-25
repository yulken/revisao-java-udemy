package secao05;

import java.util.Scanner;

public class Exercicio01 {
//	Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
//	Exemplos:
//	Entrada: Saída:
//			-10 NEGATIVO
//	Entrada: Saída:
//			8 NAO NEGATIVO
//	Entrada: Saída:
//			0 NAO NEGATIVO
	
	public static void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if (a >= 0) {
			System.out.println(a + " NAO NEGATIVO");
		}
		else {
			System.out.println(a + "  NEGATIVO");
		}
	}
}
