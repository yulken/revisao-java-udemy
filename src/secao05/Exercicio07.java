package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
//	Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//	de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//	ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).
//	Se o ponto estiver na origem, escreva a mensagem �Origem�.
//	Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a
//	situa��o.
//	Exemplos:
//		Entrada: Sa�da:
//		4.5 -2.2 Q4
//		Entrada: Sa�da:
//		0.1 0.1 Q1
//		Entrada: Sa�da:
//		0.0 0.0 Origem
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}

	}
}
