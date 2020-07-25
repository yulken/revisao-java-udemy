package secao05;

import java.util.Scanner;

public class Exercicio02 {
//	Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
//	Exemplos:
//	Entrada: Saída:
	// 12 PAR
//	Entrada: Saída:
	// -27 IMPAR
//	Entrada: Saída:
	// 0 PAR

	public static void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if (a % 2 == 0) {
			System.out.println(a + " PAR");
		}
		else {
			System.out.println(a + "  IMPAR");
		}
	}
}
