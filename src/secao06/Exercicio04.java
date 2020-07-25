package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
//	Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//	X, se for o caso.
//	Exemplo:
//	Entrada: 
//	8 
//	
//	Saída:
//	1
//	3
//	5
//	7

	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		for (int i = 1; i < x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			
		}


	}
}
