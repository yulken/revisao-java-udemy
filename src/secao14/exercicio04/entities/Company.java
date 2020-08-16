package secao14.exercicio04.entities;

public class Company extends TaxPayer{
    private Integer numberOfEmployees;

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double getTaxes(){
        double taxRate = 0.16;
        if (getNumberOfEmployees() >= 10){
            taxRate = 0.14;
        }
        return (getAnnualIncome() * taxRate);
    }
}