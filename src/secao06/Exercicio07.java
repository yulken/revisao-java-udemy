package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
//	Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//	segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
//	Exemplo:
//	Entrada:
//	3
//	3 -2
//	-8 0
//	0 8
//	
//	Saída:
//	-1.5
//	divisao impossivel
//	0.0

	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a, b;
		for (int i = 0; i < n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			if (b == 0) {
				System.out.println("divisao impossivel");
			} else System.out.println(a/b);
		}
		sc.close();
	}
}
