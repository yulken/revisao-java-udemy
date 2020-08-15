package secao13.exercicio03.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import secao13.exercicio03.entities.enums.OrderStatus;

public class Order {
    private static SimpleDateFormat orderSdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Order() {}

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return this.items;
    }
    
    public Double total() {
        Double cost = 0.0;
        for (OrderItem orderItem : items) {
            cost += orderItem.subtotal();
        }
        return cost;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: " + orderSdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        if (! items.isEmpty()){
            sb.append("Order items:\n");
            for (OrderItem orderItem : items) {
                sb.append(orderItem + "\n");
            }
        }
        sb.append("Total price: R$" + total() + "\n");

        return sb.toString();
    }
    

}