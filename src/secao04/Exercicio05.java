package secao04;

import java.util.Scanner;

public class Exercicio05 {
	
//	Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//	código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
//	Exemplos:
//	Entrada: Saída:
//	12 1 5.30
//	16 2 5.10
//			VALOR A PAGAR: R$ 15.50
	
//	Entrada: Saída:
//	13 2 15.30
//	161 4 5.20
//			VALOR A PAGAR: R$ 51.40
	
//	Entrada: Saída:
//	1 1 15.10
//	2 1 15.10
//			VALOR A PAGAR: R$ 30.20
	
	@SuppressWarnings("unused")
	public static void run() {
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, np1, np2;
		double vp1, vp2;
		
		cod1 = sc.nextInt();
		np1 = sc.nextInt();
		vp1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		np2 = sc.nextInt();
		vp2 = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",(np1*vp1+np2*vp2));
		
		
	}
}
