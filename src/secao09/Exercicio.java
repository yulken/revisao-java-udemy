package secao09;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String holder;
		char choice;
		int number;
		ContaBancaria c;
		
		System.out.printf("Enter account number: ");
		number = sc.nextInt();
		sc.nextLine(); //droga de quebra de linha
		System.out.printf("Enter account holder: ");
		holder = sc.nextLine();
		System.out.printf("Is there an initial deposit (y/n)? ");
		choice = sc.next().charAt(0);
		
		if (choice == 'y'){
			System.out.printf("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			c = new ContaBancaria(number, holder, initialDeposit);

		} else {
			c = new ContaBancaria(number, holder);
		}
		
		System.out.println("Account data:");
		System.out.println(c);
		
		System.out.printf("\nEnter a deposit value: ");
		c.deposita(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(c);
		
		System.out.printf("\nEnter a withdraw value: ");
		c.saca(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(c);
		
		sc.close();
	}
}
