package secao08.Exercicio01;

public class Rectangle {
	public double width;
	public double height;
	
	public double getArea() {
		return this.width * this.height;
	}
	public double getPerimeter() {
		return this.width * 2 + this.height * 2;
	}
	public double getDiagonal() {
		return Math.sqrt(Math.pow(this.width,2) + Math.pow(this.height,2));
	}
}
