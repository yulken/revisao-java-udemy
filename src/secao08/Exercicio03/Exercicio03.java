package secao08.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		s.name = sc.next();
		s.s1 = sc.nextDouble();
		s.s2 = sc.nextDouble();
		s.s3 = sc.nextDouble();
		System.out.println("FINAL GRADE = " + s.getFinalGrade());
		s.printStatus();
		sc.close();
		
		
	}
}
