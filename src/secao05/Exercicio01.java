package secao05;

import java.util.Scanner;

public class Exercicio01 {
//	Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
//	Exemplos:
//	Entrada: Sa�da:
//			-10 NEGATIVO
//	Entrada: Sa�da:
//			8 NAO NEGATIVO
//	Entrada: Sa�da:
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
