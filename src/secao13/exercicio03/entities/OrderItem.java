package secao13.exercicio03.entities;

public class OrderItem {
    private Integer quantity;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subtotal(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName() + ", $" + getProduct().getPrice() + 
                ", Quantity: " + getQuantity() + ", Subtotal: $" + subtotal();
    }

}