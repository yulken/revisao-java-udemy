package secao04;

import java.util.Scanner;

public class Exercicio01 {
	/*Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
		mensagem explicativa, conforme exemplos.*/
	/*Exemplos:
		Entrada: Sa�da:
		10
		30
		SOMA = 40
		
		Entrada: Sa�da:
		-30
		10
		SOMA = -20
		
		Entrada: Sa�da:
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
