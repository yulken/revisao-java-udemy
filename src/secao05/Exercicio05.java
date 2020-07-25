package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
//	Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//	seguir, calcule e mostre o valor da conta a pagar
//	Cod	Especificacao		preco
//	1	Cachorro quente		R$4.00
//	2	X-Salada			R$4.50
//	3	X-Bacon				R$5.00
//	4	Torrada Simples		R$2.00
//	5	Refrigerante		R$1.50
	
//	Exemplos:
//		Entrada: Saída:
//		3 2 Total: R$ 10.00
//		Entrada: Saída:
//		2 3 Total: R$ 13.50
	
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double price;
		sc.close();
		switch (a) {
		case 1:
			price = 4.00;
			break;
		case 2:
			price = 4.50;
			break;
		case 3:
			price = 5.00;
			break;
		case 4:
			price = 2.00;
			break;
		case 5:
			price = 1.50;
			break;
		default:
			price = 0;
			break;
		}
		
		System.out.printf("Total: R$ %.2f", price * b);
	}
}
