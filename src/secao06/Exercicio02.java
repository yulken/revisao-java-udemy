package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
//	Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//	cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//	menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
//	Exemplo:
//	Entrada: Saída:
//	2 2
//	3 -2
//	-8 -1
//	-7 1
//	0 2
			//	primeiro
			//	quarto
			//	terceiro
			//	segundo
	
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0 ) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		sc.close();
		
	}
}
