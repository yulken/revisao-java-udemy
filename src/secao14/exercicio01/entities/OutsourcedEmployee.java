package secao14.exercicio01.entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;


    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
    }

    public OutsourcedEmployee(String name, 
                                Integer hours, 
                                Double valuePerHour, 
                                Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return this.additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public Double payment() {
        return (getHours() * getValuePerHour()) + getAdditionalCharge();
    }


}