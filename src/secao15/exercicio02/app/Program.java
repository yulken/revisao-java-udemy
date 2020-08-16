package secao15.exercicio02.app;

import secao15.exercicio02.model.exception.DomainException;
import secao15.exercicio02.model.entities.Account;

public class Program {
    public static void main(String[] args) {
        try {
            Account a = new Account(8021, "Bob Brown", 500.00, 300.00);
            
            a.withdraw(100.00);
            // -> New Balance: 400.0
            
            // a.withdraw(400.0);
            // -> Withdraw error: The amount exceeds withdraw limit
            
            
            // Account a1 = new Account(8021, "Bob Brown", 200.00, 300.00);
            // a1.withdraw(250.0);
            // -> Withdraw error: Not enough balance
            //System.out.println("New Balance: " + a1.getBalance());
            System.out.println("New Balance: " + a.getBalance());

        } 
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }
}