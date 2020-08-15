package secao14.exercicio01.application;

import secao14.exercicio01.entities.Employee;
import secao14.exercicio01.entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alex", 50, 20.00);
        Employee e2 = new OutsourcedEmployee("Bob", 100, 15.00, 200.00);
        Employee e3 = new Employee("Maria", 60, 20.00);

        System.out.println("PAYMENTS");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}