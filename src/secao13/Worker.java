package secao13;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<HourContract>();

	public Worker(String name, WorkerLevel level, Double baseSalary, 
			Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	public Double income(Integer year, Integer month) {
		double totalIncome = this.baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			if (1 + cal.get(Calendar.MONTH ) == month && 
					cal.get(Calendar.YEAR) == year) {
				totalIncome += c.getTotalValue();
			}
		}
		return totalIncome;
	}
}
