package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
//	Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//	Lembrando que, por defini��o, fatorial de 0 � 1.
//	Exemplos:
//	Entrada: Sa�da:
//	4 24
//	Entrada: Sa�da:
//	1 1
//	Entrada: Sa�da:
//	5 120
//	Entrada: Sa�da:
//	0 1

	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat *= i;
		}
		System.out.println(fat);
		sc.close();
	}
}
