package secao08.Exercicio04;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double getValor(double quantity, double price) {
		return quantity * price * (1 + IOF);
	}
}
