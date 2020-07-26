package secao08.Exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price?");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double quantity = sc.nextDouble();
		sc.close();
		System.out.println("Ammount to be paid in reais = " 
							+ String.format("%.2f", CurrencyConverter.getValor(quantity, price)));
	}

}
