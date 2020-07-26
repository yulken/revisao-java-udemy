package secao10.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rent[] r = new Rent[10];
		int n = sc.nextInt();
		for (int i=1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i);
			System.out.println("Name: ");
			String name = sc.nextLine(); 
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			r[room-1] = new Rent(name, email);
		}
		sc.close();
		
		System.out.println("Busy rooms:");
		for (int j = 0; j < r.length; j++) {
			if (r[j] != null){
				System.out.println(j+1 + ": " + r[j]);
			}
		}
	}
}
