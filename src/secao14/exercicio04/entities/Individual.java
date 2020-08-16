package secao14.exercicio04.entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return this.healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double getTaxes(){
        double taxRate = 0.15;
        if (getAnnualIncome() >= 20000.0){
            taxRate = 0.25;
        }
        return (getAnnualIncome() * taxRate) - (getHealthExpenditures() * 0.5);
    }
}