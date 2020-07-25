package secao04;

import java.util.Scanner;

public class Exercicio05 {
	
//	Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
//	c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
//	Exemplos:
//	Entrada: Sa�da:
//	12 1 5.30
//	16 2 5.10
//			VALOR A PAGAR: R$ 15.50
	
//	Entrada: Sa�da:
//	13 2 15.30
//	161 4 5.20
//			VALOR A PAGAR: R$ 51.40
	
//	Entrada: Sa�da:
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
