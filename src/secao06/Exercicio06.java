package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
//	Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//	de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//	conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//	peso 5.
//
//	Exemplo:
//	Entrada: 
//	3
//	6.5 4.3 6.2
//	5.1 4.2 8.1
//	8.0 9.0 10.0
//	
//	Saída:
//	5.7
//	6.3
//	9.3

	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a, b, c, media;
		for (int i = 0; i < n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			media = (a * 2 + b * 3 + c * 5) / 10;
			System.out.printf("%.1f", media);
		}
		sc.close();
	}
}
