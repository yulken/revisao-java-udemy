package secao08.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		System.out.printf("AREA = %.2f\n", r.getArea());
		System.out.printf("PERIMETER = %.2f\n", r.getPerimeter());
		System.out.printf("DIAGONAL = %.2f\n", r.getDiagonal());
		sc.close();
	}
}
