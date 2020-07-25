package secao08.Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		System.out.printf("Name:");
		e.name = sc.next();
		System.out.printf("Gross Salary:");
		e.grossSalary = sc.nextDouble();
		System.out.printf("Tax:");
		e.tax = sc.nextDouble();		
		sc.close();
		System.out.println(e);
		
	}
}
