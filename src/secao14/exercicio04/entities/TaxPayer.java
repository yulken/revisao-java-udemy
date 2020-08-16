package secao14.exercicio04.entities;

public abstract class TaxPayer {
    private String name;
    private Double annualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return this.annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", getName(), getTaxes());
    }

    public abstract Double getTaxes();

}