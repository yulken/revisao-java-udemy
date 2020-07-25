package secao04;

import java.util.Scanner;

public class Exercicio01 {
	/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.*/
	/*Exemplos:
		Entrada: Saída:
		10
		30
		SOMA = 40
		
		Entrada: Saída:
		-30
		10
		SOMA = -20
		
		Entrada: Saída:
		0
		0
		SOMA = 0
	*/
	public static void run(){
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		System.out.println("SOMA " + (a + b));
	}
}
