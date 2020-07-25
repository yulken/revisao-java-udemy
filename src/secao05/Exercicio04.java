package secao05;

import java.util.Scanner;

public class Exercicio04 {
//	Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//	começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
//	Exemplos:
//	Entrada: Saída:
//	16 2 		O JOGO DUROU 10 HORA(S)
//	Entrada: Saída:
//	0 0 		O JOGO DUROU 24 HORA(S)
//	Entrada: Saída:
//	2 16 O 		JOGO DUROU 14 HORA(S)
	public static void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		b = (b <= a) ? b + 24 : b;
		System.out.println("O JOGO DUROU " + (b-a) + " HORAS");
	}
}
