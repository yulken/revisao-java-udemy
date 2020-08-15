package secao14.exercicio03.entities;

import secao14.exercicio03.entities.enums.Color;

public class Circle extends Shape{
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double area(){
        return Math.PI * Math.pow(radius,2);
    }
}