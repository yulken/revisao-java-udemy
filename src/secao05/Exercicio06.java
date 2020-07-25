package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
//	Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//	seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//	nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
//	Exemplos:
//	Entrada: Saída:
//	25.01 Intervalo (25,50]
//	Entrada: Saída:
//	25.00 Intervalo [0,25]
//	Entrada: Saída:
//	100.00 Intervalo (75,100]
//	Entrada: Saída:
//	-25.02 Fora de intervalo

	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		sc.close();
		if (a >= 0 && a <= 25) {
			System.out.println("Intervalo [0, 25]");
		} else if (a > 25 && a <= 50) {
			System.out.println("Intervalo (25, 50]");
		} else if (a > 50 && a <= 75) {
			System.out.println("Intervalo (50, 75]");
		} else if (a > 75 && a <= 100) {
			System.out.println("Intervalo (75, 100]");
		} else {
			System.out.println("Fora de Intervalo");
		}

	}
}
