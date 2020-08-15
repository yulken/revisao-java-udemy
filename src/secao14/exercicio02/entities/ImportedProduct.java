package secao14.exercicio02.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return this.customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return getPrice() + getCustomsFee();
    }

    @Override
    public String priceTag(){
        return getName() + " R$ " + totalPrice() + " (Customs fee: $ " + getCustomsFee() + ")"; 
    }
}