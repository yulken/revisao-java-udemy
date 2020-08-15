package secao13.exercicio03.application;

import secao13.exercicio03.entities.*;
import secao13.exercicio03.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat birthSdf = new SimpleDateFormat("dd/MM/yyyy");
        // At this point I really got tired of typing every test case now and then
        // Class instantiation will be hardcoded from now on

        //Entering client data
        Client c = new Client("Alex Green", "alex@gmail.com", birthSdf.parse("15/03/1985"));

        //Entering order data
        Order o = new Order(new Date(), OrderStatus.PROCESSING);
        OrderItem oi1 = new OrderItem(1, new Product("TV", 1000.00));
        OrderItem oi2 = new OrderItem(2, new Product("Mouse", 40.00));
        

        o.setClient(c);
        o.addItem(oi1);
        o.addItem(oi2);

        System.out.println(o);
    }
}