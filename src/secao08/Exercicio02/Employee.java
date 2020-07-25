package secao08.Exercicio02;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double getNetSalary() {
		return this.grossSalary - this.tax;
	}
	public void increaseSalary(double percentage) {
		this.grossSalary *= (1 + percentage);
	}
	public String toString() {
		return "Employee: " + this.name + ", $ " + this.getNetSalary(); 
	}
}
