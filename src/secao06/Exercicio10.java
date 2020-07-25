package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
//	Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
//	come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
//	exemplo.

//	Exemplo:
//		Entrada:
//		5 

//		Sa�da:
//		1 1 1
//		2 4 8
//		3 9 27
//		4 16 64
//		5 25 125

	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d\n", i, i * i, i * i * i);
		}

	}
}
