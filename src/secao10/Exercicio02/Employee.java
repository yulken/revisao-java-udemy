package secao10.Exercicio02;

public class Employee {
	public Integer id;
	public String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void raiseSalary(double percentage) {
		this.salary *= (1 + percentage/100);
	}
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
