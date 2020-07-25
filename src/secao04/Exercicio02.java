package secao04;

import java.util.Scanner;

public class Exercicio02 {
	/*
	 * Faca um programa para ler o valor do raio de um circulo, e depois mostrar o valor da area deste circulo com quatro
		casas decimais conforme exemplos.
		Formula da area: area = pi . raio2
		Considere o valor de pi = 3.14159
	 */
	/*
	 *  Entrada: Saida:
			2.00 A=12.5664
	 	Entrada: Saida:	
			100.64 A=31819.3103
		Entrada: Saida:
			150.00 A=70685.7750
	 */
	
	public static void run() {
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double pi = 3.14159;
		sc.close();
		System.out.printf("A=%.4f",(Math.pow(raio, 2) * pi));
		
	}
}
