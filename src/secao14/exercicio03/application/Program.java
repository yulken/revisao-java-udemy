package secao14.exercicio03.application;

import java.util.Locale;

import secao14.exercicio03.entities.Circle;
import secao14.exercicio03.entities.Rectangle;
import secao14.exercicio03.entities.Shape;
import secao14.exercicio03.entities.enums.Color;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Shape s1 = new Rectangle(Color.BLACK, 4.0, 5.0);
        Shape s2 = new Circle(Color.RED, 3.0);

        System.out.println("SHAPE AREAS:");
        System.out.printf("%.2f\n", s1.area());
        System.out.printf("%.2f\n", s2.area());
    }
}