package secao05;

import java.util.Scanner;

public class Exercicio03 {
//	Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//	Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
//	ordem crescente ou decrescente.
//	Exemplos:
//	Entrada: Sa�da:
//		6 24 Sao Multiplos
//	Entrada: Sa�da:
//		6 25 Nao sao Multiplos
//	Entrada: Sa�da:
//		24 6 Sao Multiplos
	public static void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("N�o sao multiplos");
		}
	}
}
