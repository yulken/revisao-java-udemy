package secao10.Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Employee> l = new ArrayList<Employee>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i);
			System.out.println("Id: ");
			int id = sc.nextInt();
			if (hasId(l, id)) {
				i--;
				System.out.println("This id already exists!");
				continue;
			}
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			l.add(new Employee(id, name, salary));
		}

		System.out.println("Enter the employee id that will have salary increase : ");
		int queryId = sc.nextInt();

		if (hasId(l, queryId)) {
			System.out.println("Enter the percentage: ");
			double perc = sc.nextDouble();
			Employee e = l.stream().filter(x -> x.id == queryId).findFirst().orElse(null);
			e.raiseSalary(perc);
		} else
			System.out.println("This id does not exist!");
		sc.close();

		System.out.println("List of employees:");
		for (Employee employee : l) {
			System.out.println(employee);
		}
	}

	public static boolean hasId(List<Employee> l, int id) {
		long match = l.stream().filter(x -> x.id == id).count();
		if (match > 0) {
			return true;
		}
		return false;
	}
}
