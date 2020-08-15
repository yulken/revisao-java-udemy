package secao14.exercicio02.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import secao14.exercicio02.entities.ImportedProduct;
import secao14.exercicio02.entities.Product;
import secao14.exercicio02.entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Product p1 = new ImportedProduct("Tablet", 260.00, 20.0);
        Product p2 = new Product("Notebook", 1100.00);
        Product p3 = new UsedProduct("iPhone", 400.00, sdf.parse("15/03/2017"));

        System.out.println("PRICE TAGS:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

}