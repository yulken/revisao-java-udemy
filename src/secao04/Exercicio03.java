package secao04;

import java.util.Scanner;

public class Exercicio03 {
	/*
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
		de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
		Exemplos:
		Entrada: Sa�da:
		5
		6
		7
		8
		DIFERENCA = -26
		Entrada: Sa�da:
		5
		6
		-7
		8
		DIFERENCA = 86
	 */
	
	public static void run() {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		System.out.println("DIFERENCA = " + (a * b - c*d));
		
	}
}
