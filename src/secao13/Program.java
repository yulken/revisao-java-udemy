package secao13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		Calendar cal =  Calendar.getInstance();

		System.out.println("Enter department's name: ");
		String department = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Level: ");
		String level = sc.nextLine();
		System.out.println("Base salary:");
		double baseSalary = sc.nextDouble();		
		Worker w = new Worker(name, WorkerLevel.valueOf(level), baseSalary,
				new Department(department));

		System.out.println("How many contracts to this worker?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Date (DD/MM/YYYY): ");
			String textDate = sc.nextLine();
			Date date = sdf.parse(textDate);
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			int hours = sc.nextInt();

			w.addContract(new HourContract(date, valuePerHour, hours));
		}
		
		sc.nextLine();
		System.out.println("Enter month and year to calculate income "
				+ "(MM/YYYY):");
		String queryIncome = sc.nextLine();
		cal.setTime(sdf2.parse(queryIncome));		
		double totalIncome = w.income(cal.get(Calendar.YEAR), 1
				+ cal.get(Calendar.MONTH));
		System.out.println("Name: " + w.getName());
		System.out.println("Department: " + w.getDepartment());
		System.out.println("Income for " + queryIncome + ": " 
				+ String.format("%.2f",totalIncome));
		sc.close();
	}
}
