package secao05;

import java.util.Scanner;

public class Exercicio02 {
//	Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
//	Exemplos:
//	Entrada: Sa�da:
	// 12 PAR
//	Entrada: Sa�da:
	// -27 IMPAR
//	Entrada: Sa�da:
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
