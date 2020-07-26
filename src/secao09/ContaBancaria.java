package secao09;

public class ContaBancaria {
	private int numero;
	private String titular;
	private double saldo;

	public ContaBancaria(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.setTitular(titular);
		this.deposita(depositoInicial);

	}

	public ContaBancaria(int numero, String titular) {
		this.numero = numero;
		this.setTitular(titular);

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valorDepositado) {
		this.saldo += valorDepositado;
	}

	public void saca(double valorSacado) {
		this.saldo -= (valorSacado + 5.0);
	}

	@Override
	public String toString() {
		String ret = "";
		ret += "Account " + this.getNumero() + ", Holder: " + this.getTitular() + ", Balance: $ " + this.getSaldo();
		return ret;
	}
}
