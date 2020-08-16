package secao14.exercicio04.application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import secao14.exercicio04.entities.Company;
import secao14.exercicio04.entities.Individual;
import secao14.exercicio04.entities.TaxPayer;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        TaxPayer tp1 = new Individual("Alex", 50000.00, 2000.00);
        TaxPayer tp2 = new Company("SoftTech", 400000.00, 25);
        TaxPayer tp3 = new Individual("Bob", 120000.00, 1000.00);
        
        List<TaxPayer> tpList = Arrays.asList(tp1,tp2,tp3);
        double sumTaxes = 0.0;
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : tpList) {
            sumTaxes += taxPayer.getTaxes();
            System.out.println(taxPayer);
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: %.2f", sumTaxes);
    }
}